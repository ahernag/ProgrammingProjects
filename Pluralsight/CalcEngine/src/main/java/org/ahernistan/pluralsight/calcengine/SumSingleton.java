package org.ahernistan.pluralsight.calcengine;

public class SumSingleton<T extends Number> /*implements CalculationInterface<T>*/ extends CalculationSingleton<T> {

//    private SumSingleton(){}
//
//    private static class SingletonHelper{
//        private static final SumSingleton INSTANCE = new SumSingleton();
//    }
//
//    public static SumSingleton getInstance(){
//        return SingletonHelper.INSTANCE;
//    }

    @Override
    public T calculate(T[] values) {

        T returnValue = null;

        if (values.length > 0) {

            returnValue = values[0];

            Integer intValue = 0;
            Long longValue = 0L;
            Float floatValue = 0.0f;
            Double doubleValue = 0.0d;

            if (returnValue instanceof Integer) {
                for (T value : values)
                    intValue += value.intValue();

                returnValue = (T) intValue;
            } else if (returnValue instanceof Long) {
                for (T value : values)
                    longValue += value.longValue();

                returnValue = (T) longValue;
            } else if (returnValue instanceof Float) {
                for (T value : values)
                    floatValue += value.floatValue();

                returnValue = (T) floatValue;
            } else if (returnValue instanceof Double) {
                for (T value : values)
                    doubleValue += value.doubleValue();

                returnValue = (T) doubleValue;
            }

        }

        return returnValue;

    }

}
