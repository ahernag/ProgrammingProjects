package org.ahernistan.pluralsight.calcengine;

import org.ahernistan.util.UniqueHashMap;

import java.util.Map;

public class CalcEngineData {

    final Map<String, AbstractCalculation> tokenCalculation = new UniqueHashMap<>();
    final Map<String, String> tokenSymbol = new UniqueHashMap<>();
    final Map<String, AbstractCalculation> symbolCalculation = new UniqueHashMap<>();

    CalcEngineData(SymbolAndTokensAssociation ... associations) {
        associate(associations);
        System.out.println("That's all folks!!!!!");
    }

    private void associate(SymbolAndTokensAssociation[] associations) {

        for (SymbolAndTokensAssociation symbolAndTokens : associations) {
            symbolCalculation.put(symbolAndTokens.outputSymbol.token.toString(), symbolAndTokens.calculation);

            for(OperationToken operationToken : symbolAndTokens.operationTokens) {
                tokenCalculation.put(operationToken.token.toString(), symbolAndTokens.calculation);
                tokenSymbol.put(operationToken.token.toString(), symbolAndTokens.outputSymbol.token.toString());
            }
        }
    }

}
