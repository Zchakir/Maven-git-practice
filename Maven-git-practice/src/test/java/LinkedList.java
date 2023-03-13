import java.util.List;

public class LinkedList {

    Node head;

    public LinkedList(){
        this.head=null;
    }
    public void addNode(Integer data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<Integer> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removeNode(int value) {
        if (head == null) {
            return;
        }

        // If head node contains the value, set the head to the next node
        if (head.data==value) {
            head = head.next;
            return;
        }

        // Traverse the list and find the node to remove
        Node<Integer> current = head;
        while (current.next != null) {
            if (current.next.data==value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public int size() {
        int count = 0;
        Node<Integer> current = this.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public Node getHead(){
        return this.head;
    }
    public Node<Integer> getTail() {
        if (head == null) {
            return null;
        }

        Node<Integer> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }
}
