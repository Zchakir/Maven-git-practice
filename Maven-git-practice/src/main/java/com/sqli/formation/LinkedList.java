package com.sqli.formation;

public class LinkedList {
    private LinkedList next;
    public int data;


    public LinkedList(){
        next = null;
        data = 0;
    }
    public void addNode(int i) {
        if(next == null){
            data = i;
            next = new LinkedList();
        }else{
            next.addNode(i);
        }
    }

    public int size() {
        if(next == null) return 0;
        else return next.size() + 1;
    }

    public void removeNode(int i) {
        if(next == null){
            return;
        }else if(next.data == i){
            next = next.next;
        }else{
            next.removeNode(i);
        }
    }

    public LinkedList getHead() {
        return this;
    }

    public LinkedList getTail() {
        if(next.next == null){
            return this;
        }else{
            return next.getTail();
        }
    }
}
