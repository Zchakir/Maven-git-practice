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

    public boolean removeNode(int i) {

            for (Node node : list) {
                if (node.data == i) {
                    this.list.remove(node);
                    return true;
                }
            }
            return false;

    }

    public Node getHead() {
        try {
            return list.get(0);
        } catch (Exception e) {

            return null;
        }

    }

    public Node getTail() {
        try{
        return list.get(list.size() - 1);}
        catch (Exception e){

            return null;
        }

    }


    public Node getNode(int i) {
        for (Node node : list) {
            if (node.data == i) {
                return node;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addNodeAtIndex(int i, int i1) {
        try {
            Node node = new Node(i);
            list.add(i1, node);
            return true;
        } catch (Exception e) {

            return false;
        }

    }

    public void clear() {
        list.clear();
    }
}
