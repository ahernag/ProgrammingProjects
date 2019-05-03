package org.ahernistan.pluralsight.calcengine;

public class DifferenceSingleton<T extends Number> extends AbstractCalculation<T>{

    private static DifferenceSingleton ourInstance = new DifferenceSingleton();

    public static DifferenceSingleton getInstance() {
        return ourInstance;
    }

    private DifferenceSingleton() {}

    @Override
    public T calculate(T[] values) {
        T returnValue = null;

        if (values.length > 0) {

            returnValue = values[0];

            Integer intValue = returnValue.intValue();
            Long longValue = returnValue.longValue();
            Float floatValue = returnValue.floatValue();
            Double doubleValue = returnValue.doubleValue();

            if (returnValue instanceof Integer) {
                //skip subtracting the first value from 0
                boolean first = true;

                for (T value : values) {
                    if (first)
                        first = false;
                    else
                        intValue -= value.intValue();
                }

                returnValue = (T) intValue;
            } else if (returnValue instanceof Long) {
                boolean first = true;

                for (T value : values) {
                    if (first)
                        first = false;
                    else
                        longValue -= value.longValue();
                }

                returnValue = (T) intValue;
            } else if (returnValue instanceof Float) {
                boolean first = true;

                for (T value : values) {
                    if (first)
                        first = false;
                    else
                        floatValue -= value.floatValue();
                }

                returnValue = (T) floatValue;
            } else if (returnValue instanceof Double) {
                boolean first = true;

                for (T value : values) {
                    if (first)
                        first = false;
                    else
                        doubleValue -= value.doubleValue();
                }

                returnValue = (T) doubleValue;
            }

        }

        return returnValue;

    }
}
