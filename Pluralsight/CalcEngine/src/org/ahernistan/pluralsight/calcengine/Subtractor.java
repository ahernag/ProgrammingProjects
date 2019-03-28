package org.ahernistan.pluralsight.calcengine;

public class Subtractor extends AEvaluator {

    public Subtractor(char code) {
        super(code);
    }

    @Override
    public double evaluate(double leftVal, double rightVal) {
        return leftVal - rightVal;
    }
}
