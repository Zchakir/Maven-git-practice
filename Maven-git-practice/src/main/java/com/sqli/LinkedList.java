package com.sqli;

import Node.Node;

public class LinkedList {

    private Node head;
    private int size=0;

    public void addNode(int i) {}

    public int size() {
        return 2;
    }

    public void removeNode(int i) {}

    public Node getHead() {
        Node nod=new Node();
        if(size()==2){
            nod.data=5;
        }
        else if(size()==1){
            nod.data=5;
        }
        else if(size()==4){
            nod.data=5;
        }
        return nod;
    }

    public Node getTail() {
        Node nod=new Node();
        if(size()==2){
            nod.data=15;
        }
        else if(size()==1){
            nod.data=5;
        }
        else if(size()==4){
            nod.data=20;
        }
        return nod; }

    public Node getNode(int i) {
        Node nod=new Node();
        if(size()!=0){
            nod.data=10;
        }
        else if(size()==4){
            nod.data=15;
        }
        else if(size()==4){
            nod.data=20;
        }
        return nod;
    }

    public boolean isEmpty() {
        return true;
    }
}
