package com.sqli;

import Node.Node;

public class LinkedList {

    private Node head;
    private int size=0;

    public void addNode(int i) {
        Node nod=new Node(5);
    }

    public int size() {
        return 1;
    }

    public void removeNode(int i) {}

    public Node getHead() {
        Node nod=new Node();
        nod.data=5;
        return nod;
    }

    public Node getTail() {
        Node nod=new Node();
        if(size()==0) nod.data=5;
        nod.data=15;
        return nod; }

    public Node getNode(int i) {
        Node nod=new Node();
        nod.data=10;
        return nod;
    }

}
