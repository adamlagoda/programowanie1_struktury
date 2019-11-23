package com.company.zajecia4;

import java.util.Collections;
import java.util.List;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    private final char[] operators = {'+', '-', '*', '/'};
    private String[] data;

    @Override
    public String[] mapStringToArray(String calculation) {
        List<String> elements = Collections.emptyList();

        while (!calculation.isEmpty()) {
            int index = findIndexOf(calculation);
            if (index == -1) {
                elements.add(calculation);
                break;
            }
            String element = calculation.substring(0, index);
            elements.add(element);
            element = calculation.substring(index, index + 1);
            elements.add(element);
            calculation = calculation.substring(index + 1);
        }
        return elements.toArray(new String[0]);
    }

    @Override
    public void addElementsFromArray(String[] elementsToAdd) {
        for (String element : elementsToAdd) {
            push(element);
        }
    }

    private void push(String element) {

    }

    @Override
    public int calculate() {
        int result = 0;
        while (!isEmpty()) {
            String left = pop();
            String op = pop();
            String right = "";// implementacja
            result += resultOfOperation(left, op, right);
        }
        return result;
    }

    private int resultOfOperation(String left, String op, String right) {
        return 0;
    }

    private String pop() {
        return null;
    }

    private boolean isEmpty() {

        return true;
    }

    private int findIndexOf(String calculation) {
        for (int i = 0; i < calculation.length(); i++) {
            char symbol = calculation.charAt(i);
            for (char operator : operators) {
                if (operator == symbol)
                    return i;
            }
        }
        return -1;
    }
}
