package com.company.zajecia4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    private final char[] operators = {'+', '-', '*', '/'};
    private String[] data;
    private int counter;

    public ArithmeticCalculatorImpl() {
        this.data = new String[20];
    }

    @Override
    public String[] mapStringToArray(String calculation) {
        List<String> elements = new LinkedList<>();

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
        for (int i = elementsToAdd.length - 1; i >= 0; i--) {
            push(elementsToAdd[i]);
        }

/*        List<String> listFromArray = Arrays.asList(elementsToAdd);
        Collections.reverse(listFromArray);
        listFromArray.stream()
                .forEach(this::push);*/
    }

    private void push(String element) {
        data[counter] = element;
        counter++;
    }

    @Override
    public int calculate() {

        Predicate<String> isSlashOrStarOrNull = s -> s != null && (s.equals("/") || s.equals("*"));

        int result = 0;
        String left = pop();
        while (!isEmpty()) {
            String op = pop();
            String right = pop();
            while (isSlashOrStarOrNull.test(peek())) {
                String opInner = pop();
                String rightInner = pop();
                right = Integer.toString(resultOfOperation(right, opInner, rightInner));
            }
            result = resultOfOperation(left, op, right);
            left = Integer.toString(result);
        }
        return result;
    }

    private String peek() {
        if (counter == 0)
            return null;
        return data[counter - 1];
    }

    public int resultOfOperation(String left, String op, String right) {
        if (op != null)
            switch (op) {
                case "+":
                    return Integer.parseInt(left) + Integer.parseInt(right);
                case "-":
                    return Integer.parseInt(left) - Integer.parseInt(right);
                case "*":
                    return Integer.parseInt(left) * Integer.parseInt(right);
                case "/":
                    return Integer.parseInt(left) / Integer.parseInt(right);
            }
        return 0;
    }

    private String pop() {
        if (counter == 0)
            return null;
        String result = data[counter - 1];
        counter--;
        return result;
    }

    private boolean isEmpty() {
        return counter == 0;
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
