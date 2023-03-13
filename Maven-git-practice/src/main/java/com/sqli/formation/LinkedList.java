package com.sqli.formation;

public class LinkedList {

    public Node head=null;
    public void addNode(int i) {

        Node new_node = new Node();
        new_node.data=i;


        if (head == null) {
            head = new_node;
        }
        else {

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }


    }

    public int size() {
       Node node=head;
       int compter=0;
       while(node.next!=null) {
           node=node.next;
           compter++;
       }

       return compter+1;
    }

    public void removeNode(int i) {

        Node node =head;

        while(node!=null){

            if(node.next!=null && node.next.data==i){
                node.next=node.next.next;
                break;
            }
        }




    }

    public Node getHead() {
        return new Node();
    }

    public Node getTail() {
        return new Node();

    }

    public Node getNode(int i) {
        return new Node();
    }
}
