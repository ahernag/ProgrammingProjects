package org.ahernistan.pluralsight.calcengine;

interface CalculationInterface<T extends Number> {

    T calculate(T[] values);

}
