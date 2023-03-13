import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    LinkedList () {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public void addNode(int n) {
        Node newNode = new Node(n);

        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public Node getNode(int data) {
        Node current = head;
        if(head == null) return null;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
    public void removeNode(int data) {
        if (head == null) {
            return;
        }
        // removing from beginning of list
        if (head.getData() == data) {
            head = head.getNext();
            size--;
            if (head == null) {
                tail = null;
            }
            return;
        }
        // removing from end of list
        if (tail.getData() == data) {
            Node current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            tail.setNext(null);
            size--;
            return;
        }
        // removing from middle of list
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }
    public void clear() {
        if(head == null) return;
        //traitement else
    }
    public void addNodeAtIndex() {

    }
    public int size() {
       return this.size;
    }

    public boolean isEmpty() {
        return head == null ?  true :  false;
    }
}