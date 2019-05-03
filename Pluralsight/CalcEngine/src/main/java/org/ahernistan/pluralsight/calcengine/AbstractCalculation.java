package org.ahernistan.pluralsight.calcengine;

abstract class AbstractCalculation<T extends Number> implements CalculationInterface<T> {

    @Override
    public abstract T calculate(T[] values);
}
