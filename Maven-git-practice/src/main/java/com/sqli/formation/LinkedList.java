package com.sqli.formation;



import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public List<Integer> list = new ArrayList<Integer>();
    public void addNode(int i) {
        list.add(i);
    }

    public int size() {
        return 2;
    }

    public void removeNode(int i) {
    }


    public Integer getHead() {

        return list.get(0);
    }

    public Object getTail() {
        return list.get(list.size() -1);
    }


    public Node getNode(int i) {
        Node node = new Node(i);
        return  node;
    }
}
