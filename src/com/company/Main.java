package com.company;

import com.company.zajecia4.Stack;
import com.company.zajecia4.StackImpl;

public class Main {

    public static void main(String[] args) {
       Stack stack = new StackImpl(10);
       stack.push(1);

       System.out.println(stack.toString());
    }
}
