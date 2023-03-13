import org.junit.Test;
import static org.junit.Assert.*;

public class Node {
    private int data;
    private Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public double getNode(int n) {
        return 0;
    }
}