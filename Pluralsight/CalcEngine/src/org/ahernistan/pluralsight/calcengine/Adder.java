package org.ahernistan.pluralsight.calcengine;

public class Adder extends AEvaluator {

    public Adder(char code) {
        super(code);
    }

    @Override
    public double evaluate(double leftVal, double rightVal) {
        return leftVal + rightVal;
    }
}
