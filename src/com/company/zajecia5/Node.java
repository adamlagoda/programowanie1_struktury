package com.company.zajecia5;

public class Node {

    private String value;

    private Node next;

    public Node(String element) {
        value = element;
        next = null;
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
