package org.ahernistan.pluralsight.calcengine;

public class DoublesSubtractor  extends AbstractDoublesCalculation  {

    @Override
    public Double calculate(Double ... values) {
        Double difference = 0.d;

        for (Double value : values)
            difference -= value;

        return difference;
    }
}
