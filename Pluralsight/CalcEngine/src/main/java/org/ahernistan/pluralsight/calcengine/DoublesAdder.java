package org.ahernistan.pluralsight.calcengine;

public class DoublesAdder extends AbstractDoublesCalculation {

    @Override
    public Double calculate(Double ... values) {
        Double sum = 0.d;

        for (Double value : values)
            sum += value;

        return sum;
    }

}
