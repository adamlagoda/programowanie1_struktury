package com.company.zajecia4;

public class StackImpl implements Stack {

    private int[] elements;
    private int counter;

    public StackImpl(int size) {
        elements = new int[size];
    }

    @Override
    public void push(int element) { /// element > 0
        if (element <= 0)
            return;
        elements[counter] = element;
        counter++;
    }

    @Override
    public int pop() {
        int result = elements[counter - 1];
        counter--;
        return result;
    }

    @Override
    public int peek() {
        return elements[counter -1];
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < counter; i++) {
            if (i == counter - 1)
                result += elements[i];
            else
                result += elements[i] + ",";
        }
        result += "]";
        return result;
    }
}
