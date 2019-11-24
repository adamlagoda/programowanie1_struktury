package com.company;

import com.company.zajecia4.Stack;
import com.company.zajecia4.test.TestStruktury;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TestStruktury.testCaluclator();

        List mainList = new LinkedList<>();
        Object main1 = mainList.get(0);
        mainList.add("");

        Main main2 = (Main)mainList.get(0);

        main2.testPeek();

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
