package org.ahernistan.pluralsight.calcengine;

public class ErrorOperation extends AEvaluator {

    public ErrorOperation() {}

    public ErrorOperation(char code) {
        super(code);
    }

    @Override
    public double evaluate(double leftVal, double rightVal) {
        return -1.0d/0.0d;
    }
}
