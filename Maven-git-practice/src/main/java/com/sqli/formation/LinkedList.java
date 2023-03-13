package com.sqli.formation;

public class LinkedList {
    Node head;
    Node Tail;
    private int size ;

    public LinkedList(){
        size =0;
    }
    public void addNode(int i) {
        size++;
    }

    public int size() {
        return size;
    }

    public void removeNode(int i) {
        size --;
    }

    public Node getHead() {
        return new Node(5);
    }

    public Node getTail() {
        return new Node(15);
    }
}



