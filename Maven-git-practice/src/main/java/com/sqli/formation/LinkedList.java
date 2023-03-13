package com.sqli.formation;

public class LinkedList {
   private Node head;
   private Node tail;
   private int size;

    public LinkedList(){
        head = tail = null;
        size = 0;
    }
    public void addNode(int i) {
        if(size == 0){
            Node n = new Node(i);
            head = tail = n;
        }else{
            Node n = head;
            while(n.getNext() != null) n = n.getNext();
            Node e = new Node(i);
            e.setPrevious(n);
            n.setNext(e);
            tail = e;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean removeNode(int i) {
        if(size != 0){
            Node n = head;
            while(n != null){
                if(n.data == i){
                    size--;
                    Node prev = n.getPrevious();
                    Node next = n.getNext();
                    prev.setNext(next);
                    next.setPrevious(prev);
                    return true;
                }
                n = n.getNext();
            }
        }
        return false;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Node getNode(int data) {
        if(size == 0) return null;
        Node n = head;
        while(n != null){
            if(n.data == data) return n;
            n = n.getNext();
        }
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean addNodeAtIndex(int data, int index) {
        if(index >= 0 && index <= size){
            int i = 0;
            Node n = head;
            while(i < index) {
                n = n.getNext();
                i++;
            }

            Node e = new Node(data);
            if(i == 0){
                e.setNext(head);
                head.setPrevious(e);
                head = e;
                size++;
                return true;
            }

            if(n == null){
               tail.setNext(e);
               e.setPrevious(tail);
               tail = e;
               size++;
                System.out.println("test0");
                return true;
            }

            e.setNext(n);
            e.setPrevious(n.getPrevious());
            n.getPrevious().setNext(e);
            n.setPrevious(e);
            size++;
        }
        return false;
    }

    public void print(){
        Node n = head;
        while(n != null){
            System.out.println(n.data + " :: ");
            n = n.getNext();
        }
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }
}
