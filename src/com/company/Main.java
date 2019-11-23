package com.company;

import com.company.zajecia3.ArraySDA;
import com.company.zajecia3.ArraySDAImpl;
import com.company.zajecia3.Tablica;

public class Main {

    public static void main(String[] args) {
        /*Tablica tablica = new Tablica();
        int[] tab1, tab2;
        tab1 = tablica.zadanie2(25, 1, 10);
        tab2 = tablica.zadanie2(15, 1, 10);
        tablica.zadanie3(tab1, tab2);*/
        ArraySDA tablica = new ArraySDAImpl();
        tablica.addElement(2, 0);
        System.out.println(tablica.toString());
    }
}
