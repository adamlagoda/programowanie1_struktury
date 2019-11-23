package com.company.zajecia3;

import java.util.Arrays;

public class ArraySDAImpl implements ArraySDA {

    private int[] store;
    private int counter;

    public ArraySDAImpl() {
        store = new int[10];
    }

    @Override
    public void addElement(int element) {
       // WYSZUKAJ_INDEKS;
       // WSTAW_NA_INDEKSIE;
    }

    @Override
    public int findIndex(int value) {
        int index = 0;
        for (int i = 0; i < counter; i++) {
            if (store[i] >= value)
                return i;
        }
        return -1;
    }

    public int findIndex(int min, int max, int element) {
        int middle = (max - min) / 2;
        if (middle == 0 || middle == 1)
            return max;
        else if (store[middle] == element)
            return middle;
        else if (store[middle] < element)
            return findIndex(middle, max, element);
        else
            return findIndex(min, middle, element);
    }

    @Override
    public int addElement(int element, int index) {
        if (index > counter)
            return  -1;
        if (counter == store.length) {
            increaseSize();
        }
        for (int i = counter; i > index; i--) {
            store[i] = store[i-1];
        }
        store[index] = element;
        counter++;
        return 1;
    }

    @Override
    public int getElement(int index) {
        if (index > counter || index < 0)
            return -1;
        return store[index];
    }

    @Override
    public int length() {
        return counter;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < counter; i++) {
            result = result + store[i] + ",";
        }
        result = result + "]";
        return result;
    }

    private void increaseSize() {
        int[] tmp = new int[counter * 2];
        for (int i = 0; i < counter; i++) {
            tmp[i] = store[i];
        }
        store = tmp;
    }
}
