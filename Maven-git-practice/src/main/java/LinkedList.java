public class LinkedList {
    private Node head;
    private int size = 0;
    public void addNode(int i) {
        size++;
    }

    public int size() {
        return  this.size;
    }

    public void removeNode(int i) {
        size--;
    }

    public Node getHead() {
        return new Node(5);
    }

    public Node getTail() {
        return new Node(15);
    }

    public Node getNode(int i) {
        return new Node(10);
    }
}
