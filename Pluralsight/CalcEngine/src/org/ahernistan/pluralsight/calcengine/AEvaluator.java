package org.ahernistan.pluralsight.calcengine;

abstract class AEvaluator implements IEvaluator {

    private char code;

    public AEvaluator() {
        this.code = '?';
    }

    public AEvaluator(char code) {
        this.code = code;
    }

    public char getCode() {
        return this.code;
    }

    @Override
    public abstract double evaluate(double leftVal, double rightVal);

}
