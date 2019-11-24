package com.company.zajecia5;

public class ListaSDAImpl implements ListaSDA {

    private Node root;

    @Override
    public void addElement(String value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node newElement = new Node(value);
            temp.setNext(newElement);
        }
    }

    @Override
    public void addElement(int index, String element) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void remove(String element) {

    }

    @Override
    public int findIndex(String element) {
        return 0;
    }


}
