package com.sqli.formation;



import com.sqli.formation.Node;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    int size;

    List<Node> list = new ArrayList<>();

    public void addNode(int i) {
        Node node = new Node(i);
        list.add(node);
    }

    public int size() {
        return this.list.size();
    }

    public void removeNode(int i) {
        Node node = new Node(i);
        this.list.remove(node);
    }

    public Node getHead() {
        return list.get(0);
    }

    public Node getTail() {
        return list.get(list.size() - 1);


    }


    public Node getNode(int i) {
        return new Node(i);
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
