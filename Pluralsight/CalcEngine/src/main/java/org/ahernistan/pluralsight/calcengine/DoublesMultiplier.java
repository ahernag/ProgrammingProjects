package org.ahernistan.pluralsight.calcengine;

public class DoublesMultiplier  extends AbstractDoublesCalculation {

    @Override
    public Double calculate(Double ... values) {
        int numFactors = values.length;
        Double product = numFactors == 0 ? 0.0d : values[1];

        for (int i = 1; i < numFactors; i++)
            product /= values[i];

        return product;
    }
}
