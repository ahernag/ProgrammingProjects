/**
 * @deprecated Change to standard class with more conventional patters (Abstract factory) Alternative class ref to follow
 */
package org.ahernistan.pluralsight.calcengine;

import java.util.HashMap;
import java.util.Map;

public enum Operation {
    DIVIDE(new Divider('d')),
    ADD(new Adder('a')),
    SUBTRACT(new Subtractor('s')),
    MULTIPLY(new Multiplier('m')),
    ERROR(new ErrorOperation());

    private final AEvaluator evaluation;
    private static final Map<Character, Operation> opCodeMap = new HashMap<>();

    Operation(AEvaluator evaluation) {
        this.evaluation = evaluation;
    }

    private AEvaluator getEvaluator() {
        return this.evaluation;
    }


    static {
        for (Operation operation : Operation.values()) {
            opCodeMap.put(operation.getEvaluator().getCode(), operation);
        }
    }


    public static void evaluate(char code, double leftVal, double rightVal) {
        Operation operation = null;
        AEvaluator evaluator = null;
        double result = 0.0d;

        if (opCodeMap.containsKey(code)) {
            operation = opCodeMap.get(code);
        } else {
            System.err.printf("Error: Op code '%c' not recognized.%n", code);
            operation = Operation.ERROR;
        }

        evaluator = operation.getEvaluator();
        result = evaluator.evaluate(leftVal, rightVal);
        System.out.printf("%f %s[opcode(%c)] %f = %f%n", leftVal, operation.toString(), evaluator.getCode(), rightVal, result);
    }
}
