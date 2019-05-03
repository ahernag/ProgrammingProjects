package org.ahernistan.pluralsight.calcengine;

public class CalculationSingleton<T extends Number> implements CalculationInterface<T> {

    protected enum SingletonCheck {
        INTERNAL;
    }

    private CalculationSingleton(SingletonCheck internal){}

    private static class SingletonHelper{
        private static final CalculationSingleton INSTANCE = new CalculationSingleton(SingletonCheck.INTERNAL);
    }

    public static CalculationSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public  CalculationSingleton() {
        CalculationSingleton.getInstance();
    }

    @Override
    public T calculate(T[] values) {

        T returnValue = null;

        return returnValue;
    }
}
