package org.ahernistan.pluralsight.calcengine;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumSingletonTest {

    SumSingleton<Integer> testSumInt =  new SumSingleton<>();
    SumSingleton<Double> testSumDbl =  new SumSingleton<>();

    @Test
    void intTestSimple() {
        TestHarness<Integer> input = new TestHarness<>(1, 1);
        assertEquals(2, testSumInt.calculate(input.values));
    }

    @Test
    void intTestALittleMore() {
        TestHarness<Integer> input = new TestHarness<>(1, 100, -99, 1000);
        assertEquals(1002, testSumInt.calculate(input.values));
    }

    @Test
    void dblTestSimple() {
        TestHarness<Double> input = new TestHarness<>(1.0, 100.0, -99.5, 1000.0);
        assertEquals(1001.5, testSumDbl.calculate(input.values));
    }



}