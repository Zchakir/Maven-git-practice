public class LinkedList {
    private Node head;
    private int size;

    public void addNode(int i) {
        if(head == null) head = new Node(i);
        else if (head.next == null) {
            head.next = new Node(i);
        }
        else {
            Node tail = head.next;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = new Node(i);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void removeNode(int i) {
        size--;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        Node tail = head;
        if (head.next != null) {
            tail.next = head.next;
            while (tail.next != null) {
                tail = tail.next;
            }
        }
        return tail;
    }

    public Node getNode(int i) {
        return new Node(10);
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
