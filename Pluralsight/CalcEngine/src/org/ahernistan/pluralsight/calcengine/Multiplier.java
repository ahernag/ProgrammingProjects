package org.ahernistan.pluralsight.calcengine;

public class Multiplier extends AEvaluator {

    public Multiplier(char code) {
        super(code);
    }

    @Override
    public double evaluate(double leftVal, double rightVal) {
        return leftVal * rightVal;
    }
}
