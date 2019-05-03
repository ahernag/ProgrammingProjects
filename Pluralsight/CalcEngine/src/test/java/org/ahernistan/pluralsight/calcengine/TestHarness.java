package org.ahernistan.pluralsight.calcengine;

public class TestHarness<T extends Number> {
    T[] values;

    TestHarness(T... inputs) {
        this.values = inputs;
    }
}
