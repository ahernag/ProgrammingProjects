package org.ahernistan.pluralsight.calcengine;

public class Divider extends AEvaluator {

    public Divider(char code) {
        super(code);
    }
    @Override
    public double evaluate(double leftVal, double rightVal) {
       return leftVal / rightVal;
    }
}
