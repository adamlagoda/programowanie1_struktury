package com.company;

import com.company.zajecia4.ArithmeticCalculatorImpl;
import com.company.zajecia4.Stack;

public class Main {

    public static void main(String[] args) {
        testCaluclator();
    }

    private static void testCaluclator() {
        String input = "1+2*6/3+2";
        int expected = 7;

        ArithmeticCalculatorImpl calculator = new ArithmeticCalculatorImpl();

        String[] arrOfElements = calculator.mapStringToArray(input);
        calculator.addElementsFromArray(arrOfElements);

        System.out.println(expected == calculator.calculate());
    }

    private static void testPop(Stack stack) {
        System.out.println("Test pop");
        stack.push(7);
        int beforeSize = stack.size();
        int actual = stack.pop();

        System.out.println(beforeSize == stack.size() + 1);
        System.out.println(actual == 7);
    }

    private static void testPeek(Stack stack) {
        System.out.println("Test peek");
        stack.push(8);
        int beforeSize = stack.size();

        int actual = stack.peek();
        System.out.println(beforeSize == stack.size());
        System.out.println(actual == 8);
    }
}
