import java.util.*;
public class LinkedList {




    class Node
    {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    Node Tail;

    public void addNode(int i) {
        Node new_node = new Node(i);
        new_node.next = Tail;
        Tail = new_node;
    }


    public int size() {
        Node temp = Tail;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public Node getHead() {
        Node temp = Tail;
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp;

    }
    public Node getTail() {
        return this.Tail;

    }

    public void removeNode(int i) {
        {
            // Store head node
            Node temp = Tail, prev = null;

            // If head node itself holds the key to be deleted
            if (temp != null && temp.data == i) {
                Tail = temp.next; // Changed head
                return;
            }

            // Search for the key to be deleted, keep track of
            // the previous node as we need to change temp.next
            while (temp != null && temp.data != i) {
                prev = temp;
                temp = temp.next;
            }

            // If key was not present in linked list
            if (temp == null)
                return;

            // Unlink the node from linked list
            prev.next = temp.next;
        }


    }



}
