package org.ahernistan.pluralsight.calcengine;

import org.ahernistan.util.UniqueHashMap;

import java.util.HashMap;
import java.util.Map;

public class CalcEngineData {

    final Map<String, ACalculation> tokenCalculation = new UniqueHashMap<>();
    final Map<String, Character> tokenSymbol = new UniqueHashMap<>();
    final Map<Character, ACalculation> symbolCalculation = new UniqueHashMap<>();

    CalcEngineData() {
        associate(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('+', "add", "plus")), new Adder());
        associate(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('-', "subtract", "minus")), new Subtractor());
        associate(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('x', "multiply", "times")), new Multiplier());
        associate(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('÷', "divide")), new Divider());
    }

    private void associate(OpSymbolAndTokensGroups opSymbolAndTokensGroups, ACalculation calculation) {
        OperationSymbolAndTokens[] symbolAndTokensItems = opSymbolAndTokensGroups.symbolAndTokensGroup;

        for (OperationSymbolAndTokens symbolAndTokens : symbolAndTokensItems) {
            char symbol = symbolAndTokens.operationSymbol;
            symbolCalculation.put(symbol, calculation);
            String[] tokens = symbolAndTokens.operationTokens;
            for (String token : tokens) {
                tokenCalculation.put(token, calculation);
                tokenSymbol.put(token, symbol);
            }
        }
    }

}
