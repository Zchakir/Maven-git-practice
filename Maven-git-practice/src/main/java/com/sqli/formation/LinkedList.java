package com.sqli.formation;



import com.sqli.formation.Node;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    int size;

    List<Integer> list = new ArrayList<>();

    public void addNode(int i) {
        list.add(i);
    }

    public int size() {
        return this.list.size();
    }

    public void removeNode(int i) {
        list.remove(Integer.valueOf(i));
    }

    public Node getHead() {
        Node node = new com.sqli.formation.Node(this.list.get(0));
        return node;
    }

    public Node getTail() {
        Node node = new com.sqli.formation.Node(this.list.get(this.list.size()-1));
        return node;


    }


    public Node getNode(int i) {
        return new Node(i);
    }
}
