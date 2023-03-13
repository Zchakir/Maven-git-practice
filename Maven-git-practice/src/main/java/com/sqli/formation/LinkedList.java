package com.sqli.formation;



import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public List<Node> list = new ArrayList<Node>();
    public void addNode(int i) {
        Node node = new Node(i);
        list.add(node);
    }

    public int size() {
        return list.size();
    }

    public void removeNode(int i) {
    }


    public Node getHead() {

        return list.get(0);
    }

    public Node getTail() {
        return list.get(list.size() -1);
    }


    public Node getNode(int i) {
    for (Node node : list){
        if (node.data == i){
            return node;
        }
    }
     return  list.get(i);
    }

    public boolean isEmpty() {
        if (list.isEmpty()){
            return true;
        }
        return false;
    }

    public void addNodeAtIndex(int i, int index) {
        list.add(index,new Node(i));

    }
}
