package com.sqli.formation;



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

    public Object getHead() {
        return this.list.get(0);
    }

    public Object getTail() {
        return list.get(list.size()-1);


    }


}
