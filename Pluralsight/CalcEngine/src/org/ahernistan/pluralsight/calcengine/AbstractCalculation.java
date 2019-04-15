package org.ahernistan.pluralsight.calcengine;

abstract class AbstractCalculation<T> implements CalculationInterface<T> {
    @Override
    public  abstract T calculate(T... values);
}
