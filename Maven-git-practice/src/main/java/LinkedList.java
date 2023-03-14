import java.util.*;
import java.util.*;
public class LinkedList {

    public LinkedList() {

    }




    //constructor
    class Node
        {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    Node head=null;
    Node tail=null;
    public void addNode(int i) {

        Node new_node = new Node(i);
        if(head==null){
            head = new_node;

            tail = new_node;
        }
//        new_node.next = head;
//        head = new_node;
//        System.out.println(head);

        else{
            tail.next =new_node;

            tail = new_node;
        }
    }
    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void removeNode(int i) {

        Node temp = head;
        Node prev=null;
        //si notre element a supprimer est le referencer par le head
        if(temp!=null && temp.data==i){
            temp.next=head;
        }
        // Search for the key to be deleted, keep track of
        while(temp.next!=null && temp.data!=i){
            prev=temp;
            temp=temp.next;
        }
        // If key was not present in linked list
            if (temp == null){
                return;
            }
        // Unlink the node from linked list
            prev.next = temp.next;




    }

    public Node  getHead() {
        return head;


    }

    public Node getTail() {
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;


    }
    public Node getNode(int i) {
        Node temp =head;
        while(temp!=null ){
            if(temp.data==i){
                return temp;
            }
            temp=temp.next;
        }

        // Unlink the node from linked list
        return null;

    }
    public boolean isEmpty() {
        Node temp=head;
        if(temp==null){
            return true;
        }
        else {
            return false;
        }

    }
    public void addNodeAtIndex(int data, int index) {
        Node newnode=new Node(data);
        Node temp=head;
        for(int i=0 ; i< index;i++){
            temp=temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        System.out.println(head);


    }











//    class Node
//    {
//        int data;
//        Node next;
//        Node(int d)  { data = d;  next = null; }
//    }
//    Node Tail;
//
//    public void addNode(int i) {
//        Node new_node = new Node(i);
//        new_node.next = Tail;
//        Tail = new_node;
//    }
//
//
//    public int size() {
//        Node temp = Tail;
//        int count = 0;
//        while (temp != null)
//        {
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
//    public Node getHead() {
//        Node temp = Tail;
//        while(temp.next != null) {
//            temp = temp.next;
//        }
//        return temp;
//
//    }
//    public Node getTail() {
//        return this.Tail;
//
//    }
//
//    public void removeNode(int i) {
//        {
//            // Store head node
//            Node temp = head, prev = null;
//
//            // If head node itself holds the key to be deleted
//            if (temp != null && temp.data == i) {
//                head= temp.next; // Changed head
//                return;
//            }
//
//            // Search for the key to be deleted, keep track of
//            // the previous node as we need to change temp.next
//            while (temp != null && temp.data != i) {
//                prev = temp;
//                temp = temp.next;
//            }
//
//            // If key was not present in linked list
//            if (temp == null)
//                return;
//
//            // Unlink the node from linked list
//            prev.next = temp.next;
//        }
//
//
//    }




}
