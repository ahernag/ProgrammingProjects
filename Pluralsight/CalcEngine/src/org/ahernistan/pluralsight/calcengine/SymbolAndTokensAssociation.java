package org.ahernistan.pluralsight.calcengine;

public class SymbolAndTokensAssociation<S> {
    AbstractCalculation calculation = null;
    OutputSymbol<S> outputSymbol = null;
    OperationToken[] operationTokens = null;

    SymbolAndTokensAssociation(AbstractCalculation calculation, S inputSymbol, String ... tokens) throws InvalidTokenException {
        this.calculation = calculation;

        InvalidTokenException outputSymbolError = null;
        InvalidTokenException operationTokensError = null;

        try {
            this.outputSymbol = new OutputSymbol<S>(inputSymbol);
        } catch (InvalidTokenException e) {
            outputSymbolError = new InvalidTokenException("\nOutputSymbol '" + inputSymbol + "' is invalid.", false);
        }

        try {
            createOperationTokens(tokens);
        } catch (InvalidTokenException e) {
            operationTokensError = e;
        }

        if (outputSymbolError != null || operationTokensError != null)
            throw new InvalidTokenException((outputSymbolError != null ? outputSymbolError.additionalErrorMessage : "") +
                    (operationTokensError != null ? operationTokensError.additionalErrorMessage : ""), true);
    }

    private void createOperationTokens(String[] inputTokens) throws InvalidTokenException {

        int numInputTokens = inputTokens.length;
        int errorCount = 0;
        StringBuilder messageBuilder = null;

        if (numInputTokens > 0) {
            this.operationTokens = new OperationToken[numInputTokens];

            for (int i = 0; i < numInputTokens; i++) {
                try {
                    this.operationTokens[i] = new OperationToken(inputTokens[i]);
                } catch (InvalidTokenException e) {
                    if (errorCount == 0) {
                        messageBuilder = new StringBuilder(132);
                        messageBuilder.append("\nOperation Token Errors (order:token): ");
                    }

                    errorCount++;
                    messageBuilder.append("(");
                    messageBuilder.append(i);
                    messageBuilder.append(":");
                    messageBuilder.append(inputTokens[i]);
                    messageBuilder.append(") ");

                }
            }

            if (errorCount > 0)
                throw new InvalidTokenException(messageBuilder.toString(), false);
        } else
            throw new InvalidTokenException("\nMust have at least one operation token.", false);

    }
}
