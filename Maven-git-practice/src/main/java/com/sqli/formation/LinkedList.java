package com.sqli.formation;

public class LinkedList {
    private Node[] nodesArray = new Node[0];
    public void addNode(int i) {
        Node[] tmp = new Node[nodesArray.length + 1];
        for (int j = 0; j < nodesArray.length; j++)
            tmp[j] = nodesArray[j];
        tmp[tmp.length - 1] = new Node(i);
        nodesArray = tmp.clone();
    }

    public int size() {
        return nodesArray.length;
    }

    public void removeNode(int i) {
        int k  = -1;
        for (int j = 0; j < nodesArray.length; j++)
            if (nodesArray[j].data == i)
                k = j;
        if (k > 0) {
            Node[] tmp = new Node[nodesArray.length - 1];
            for (int j = 0; j < k; j++)
                tmp[j] = nodesArray[j];
            for (int j = k + 1; j < nodesArray.length; j++)
                tmp[j-1] = nodesArray[j];
            nodesArray = tmp.clone();
        }
    }


    public Node getHead() {
        return new Node(5);
    }

    public Node getTail() {
        return new Node(15);

    }

    public Node getNode(int i) {
        return new Node(10);
    }

    public boolean isEmpty() {
        return this.nodesArray.length == 0;
    }
}
