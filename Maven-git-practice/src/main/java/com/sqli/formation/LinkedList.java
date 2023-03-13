package com.sqli.formation;

public class LinkedList {
    private Node head;

    public void addNode(int i) {
        Node node = new Node();
        node.data = i;
        if(this.head == null)
            this.head = node;
        else{
            Node last = this.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    public int size() {
        int size = 0;
        Node node = head;
        while(node != null){
            size++;
            node = node.next;
        }
        return size;
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
