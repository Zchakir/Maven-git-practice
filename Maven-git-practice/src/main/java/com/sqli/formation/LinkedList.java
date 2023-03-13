package com.sqli.formation;

public class LinkedList {
    private Node[] nodesArray = new Node[0];
    public void addNode(int value) {
        Node[] tmp = new Node[nodesArray.length + 1];
        for (int j = 0; j < nodesArray.length; j++)
            tmp[j] = nodesArray[j];
        tmp[tmp.length - 1] = new Node(value);
        nodesArray = tmp.clone();
    }

    public int size() {
        return nodesArray.length;
    }

    public void removeNode(int value) {
        int k  = -1;
        for (int j = 0; j < nodesArray.length; j++)
            if (nodesArray[j].data == value)
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
        return this.nodesArray[nodesArray.length - 1];

    }

    public Node getNode(int index) {
        return this.nodesArray[index];
    }

    public boolean isEmpty() {
        return this.nodesArray.length == 0;
    }

    public void addNodeAtIndex(int value, int index) {
        Node[] tmp = new Node[nodesArray.length + 1];
        for (int j = 0; j < index; j++)
            tmp[j] = this.nodesArray[j];
        tmp[index] = new Node(value);
        for (int j = index + 1 ; j <= nodesArray.length; j++)
            tmp[j] = this.nodesArray[j-1];
        this.nodesArray = tmp.clone();
    }
}