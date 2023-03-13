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

    public boolean removeNode(int i) {
        for (Node node :list){
            if (node.data == i){
                list.remove(node);
            }
            return true;
        }
        return false;
    }


    public Node getHead() {
        try {
            return list.get(0);
        }catch (Exception e){
            return null;
        }

    }

    public Node getTail() {
        try {
            return list.get(list.size() - 1);
        }catch (Exception e){
            return null;
        }
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

    public boolean addNodeAtIndex(int i, int index) {
        try{
            Node node = new Node(i);
            list.add(index,node);
            return true;
        }catch (Exception e){
            return false;
        }


    }
}
