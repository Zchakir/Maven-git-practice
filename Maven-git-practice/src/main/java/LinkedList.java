public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        head = new Node(5);
    }

    public void addNode(int i) {
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
        return head.next != null ? head.next : head;
    }

    public Node getNode(int i) {
        return new Node(10);
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
