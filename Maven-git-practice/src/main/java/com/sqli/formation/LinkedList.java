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
        if (isEmpty()) {
            head = node;
        } else {
            Tail.next = node;
        }
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
        int incriment =0;
        Node node = head;
        while(incriment != i){
            node = node.next;
            incriment++;
        }
        return node;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addNodeAtIndex(int data, int index) {
        if (index < 0 || index > size) {
            return false;
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (Tail == null) {
                Tail = newNode;
            }
        } else if (index == size) {
            Tail.next = newNode;
            Tail = newNode;
        } else {
            Node current = getNode(index - 1);
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
        return true;
    }

}



