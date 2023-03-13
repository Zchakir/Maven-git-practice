package com.sqli.formation;

public class LinkedList {

    private Node head = null;

    public void addNode(int i) {
        if (this.head == null) {
            this.head = new Node();
            this.head.data = i;
        } else {

            Node node = new Node();
            node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node();
            node.next.data = i;

        }
    }

    public int size() {
        int cpt = 0;
        Node node = new Node();
        node = this.head;
        while (node != null) {
            cpt++;
            node = node.next;
        }
        return cpt;
    }

    public void removeNode(int i) {
        Node node =head;
        while(node!=null){
            if(node.next!=null && node.next.data==i){
                node.next=node.next.next;
                break;
            }
        }
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        Node node = new Node();
        node = this.head;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    public Node getNode(int i) {
        return new Node();
    }
}
