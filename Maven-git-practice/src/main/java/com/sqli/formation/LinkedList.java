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
        Tail = node;
        size++;
    }

    public int size() {
        return size;
    }

    public void removeNode(int i) {
        size--;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return Tail;
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



