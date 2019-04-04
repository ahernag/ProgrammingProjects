package org.ahernistan.pluralsight.calcengine;

import java.util.HashMap;
import java.util.Map;

public class CalcEngineData {

    private enum CalculationTypes {
        //put new calculations here
        //tokens are the words used to activate a calculation type and must be unique throughout the structure
        //symbols are the characters used to symbolize the calculation type and must be unique to a set of tokens and
        //also unique to the calculation type
        ADD(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('+', "add", "plus")), new Adder()),
        SUBTRACT(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('-', "subtract", "minus")), new Subtractor()),
        MULTIPLY(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('x', "multiply", "times")), new Multiplier()),
        DIVIDE(new OpSymbolAndTokensGroups(new OperationSymbolAndTokens('÷', "divide")), new Divider());

        OpSymbolAndTokensGroups opSymbolAndTokensGroups;
        ACalculation calculation;

        final Map<String, ACalculation> tokenCalculation = new HashMap<>();
        final Map<String, Character> tokenSymbol = new HashMap<>();
        final Map<Character, CalculationTypes> symbolCalculationType = new HashMap<>();

        CalculationTypes(OpSymbolAndTokensGroups opSymbolAndTokensGroups, ACalculation calculation) {
            this.opSymbolAndTokensGroups = opSymbolAndTokensGroups;
            this.calculation = calculation;

           OperationSymbolAndTokens[] symbolAndTokensItems = opSymbolAndTokensGroups.symbolAndTokensGroup;

            for (OperationSymbolAndTokens symbolAndTokens : symbolAndTokensItems) {
                String[] tokens = symbolAndTokens.operationTokens;
                for (String token : tokens) {
                    //todo: these maps insure uniqueness at multiple levels and the lookups will simplify the code
                    //todo: these will need try/catch blocks as this progresses
                    tokenCalculation.put(token, calculation);
                    tokenSymbol.put(token, symbolAndTokens.operationSymbol);
                    symbolCalculationType.put(symbolAndTokens.operationSymbol, this);
                }
            }
        }


    }
}
