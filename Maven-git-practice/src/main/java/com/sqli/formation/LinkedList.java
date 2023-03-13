package com.sqli.formation;

public class LinkedList {
    private Node head;

    public void addNode(int i) {
        Node node = new Node();
        node.data = i;
        if(head == null)
            head = node;
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    public int size() {
        return 3;
    }

    public void removeNode(int i) {
    }

    public Node getHead() {
        return new Node();
    }
    public Node getTail() {
        return new Node();
    }
}
