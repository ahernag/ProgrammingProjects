package org.ahernistan.pluralsight.calcengine;

public class DoublesDivider  extends AbstractDoublesCalculation {

    @Override
    public Double calculate(Double ... values) {
        int numDivisors = values.length;
        Double quotient = numDivisors == 0 ? 0.0d : values[1];

        for (int i = 1; i < numDivisors; i++)
            quotient /= values[i];

        return quotient;
    }
}
