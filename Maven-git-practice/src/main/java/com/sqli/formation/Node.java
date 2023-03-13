package com.sqli.formation;

public class Node implements Comparable<Node>{
    public int data;

    public Node(int value) {
        data = value;
    }

    @Override
    public int compareTo(Node o) {
        return this.data - o.data;
    }
}
