package org.ahernistan.pluralsight.calcengine;

public class OperationSymbolAndTokens {
    char operationSymbol;
    String[] operationTokens;

    OperationSymbolAndTokens(char symbol, String ... tokens) {
        this.operationSymbol = symbol;
        this.operationTokens = tokens;
    }

}
