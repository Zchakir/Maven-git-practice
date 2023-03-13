package com.sqli.formation;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addNode(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean removeNode(int data) {
        if (isEmpty()) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            if (head == null) {
                tail = null;
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
                    tail = prev;
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
        return tail;
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
        return head == null;
    }

    public boolean addNodeAtIndex(int data, int index) {
        if (index < 0 || index > size) {
            return false;
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else if (index == size) {
            tail.next = newNode;
            tail = newNode;
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
        tail = null;
        size = 0;
    }
}
