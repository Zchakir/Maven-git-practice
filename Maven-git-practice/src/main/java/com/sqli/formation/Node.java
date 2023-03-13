package com.sqli.formation;

public class Node implements Comparable<Node>{
    public int data;

    public Node(int i) {
        data = i;
    }

    @Override
    public int compareTo(Node o) {
        return this.data - o.data;
    }
}
