package com.sqli.formation;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private List list ;

    public LinkedList(){
        list = new ArrayList<Integer>();
    }
    public void addNode(int i) {
        list.add(i);
    }

    public int size() {
        return list.size();
    }

    public void removeNode(int i) {
        list.remove(0);
    }

    public Object getHead() {
        return  list.get(0);
    }
}
