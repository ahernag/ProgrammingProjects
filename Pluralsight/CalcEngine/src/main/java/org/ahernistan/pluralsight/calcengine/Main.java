package org.ahernistan.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) throws Exception{

        //try {
            CalcEngineData calcEngineData = new CalcEngineData(
                    new SymbolAndTokensAssociation<Character>(new DoublesAdder(), '+', "add", "plus"),
                    new SymbolAndTokensAssociation<Character>(new DoublesSubtractor(), '-', "subtract", "minus"),
                    new SymbolAndTokensAssociation<Character>(new DoublesMultiplier(), '*', "multiply"),
                    new SymbolAndTokensAssociation<Character>(new DoublesMultiplier(), 'x', "times"),
                    new SymbolAndTokensAssociation<Character>(new DoublesDivider(), '÷', "divide_by", "goes_into"),
                    new SymbolAndTokensAssociation<Character>(new DoublesDivider(), '/', "divide")
            );
        //} catch (Exception e) {
        //    System.err.println(e.getMessage());
        //}


    }
}
