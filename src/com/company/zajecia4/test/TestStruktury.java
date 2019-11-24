package com.company.zajecia4.test;

import com.company.zajecia4.ArithmeticCalculatorImpl;

public class TestStruktury {
    public static void testCaluclator() {
        String input = "1+2*6/3+2";
        int expected = 7;

        ArithmeticCalculatorImpl calculator = new ArithmeticCalculatorImpl();

        String[] arrOfElements = calculator.mapStringToArray(input);
        calculator.addElementsFromArray(arrOfElements);

        System.out.println(expected == calculator.calculate());
    }
}
