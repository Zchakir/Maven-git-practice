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

    public boolean removeNode(int data) {
        if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            if (head == null) {
                Tail = null;
            }
            size--;
            return true;
        }

        Node prev = head;
        Node current = head.next;
        while (current != null) {
            if (current.data == data) {
                prev.next = current.next;
                if (prev.next == null) {
                    Tail = prev;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return Tail;
    }

    public Node getNode(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
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

    public void clear() {
        head = null;
        Tail = null;
        size = 0;
    }

}



