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
        Node node = this.head;
        while(node.next != null){
            if(node.next.data == i){
                node.next = node.next.next;
            }
            node = node.next;
        }
    }


    public Node getHead() {
        return this.head;
    }
    public Node getTail() {
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        return node;
    }

    public Node getNode(int i) {
       Node node = head;
       while(node.next != null){
           if(node.data == i) return node;
           node = node.next;
       }
       return null;
    }

    public boolean isEmpty(){
        return size() == 0;
    }


    public void addNodeAtIndex(int nodeValue, int index) {
        Node nodeToInsert = new Node();
        nodeToInsert.data = nodeValue;
        if(isEmpty()){
            this.head = nodeToInsert;
            return;
        }
        Node node = this.head;
        int currentIndex = 0;
        while(node.next != null){
            if(currentIndex + 1 == index){
                nodeToInsert.next = node.next;
                node.next = nodeToInsert;
                return;
            }
            currentIndex++;
            node = node.next;
        }
    }
}
