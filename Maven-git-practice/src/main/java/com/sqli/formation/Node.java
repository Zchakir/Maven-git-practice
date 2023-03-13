package com.sqli.formation;

public class Node {
    public int data;
    private Node next;
    private Node previous;

    public Node(int data){
        this.data = data;
        this.next = this.previous = null;
    }


    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
