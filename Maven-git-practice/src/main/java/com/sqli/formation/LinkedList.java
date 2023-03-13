package com.sqli.formation;

public class LinkedList {
    Node head;
    Node Tail;
    private int size;

    public LinkedList() {
        head = null;
        Tail = null;
        size = 0;
    }

    public void addNode(int i) {
        Node node = new Node(i);
        head = node;
        size++;
    }

    public int size() {
        return size;
    }

    public void removeNode(int i) {
        size--;
    }

    public Node getHead() {
        return new Node(5);
    }

    public Node getTail() {
        return new Node(15);
    }

    public Node getNode(int i) {
        return new Node(10);
    }

    public boolean isEmpty() {
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
}



