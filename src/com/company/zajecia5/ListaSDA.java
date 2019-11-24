package com.company.zajecia5;

public interface ListaSDA {

    void addElement(String element);

    void addElement(int index, String element);

    int size();

    void remove(String element);

    int findIndex (String element);
}
