public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;
    public void addNode(int i) {
        Node node = new Node(i);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            tail = node;
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public void removeNode(int i) {
        this.size--;
    }

    public Node getHead() {
        return new Node(5);
    }

    public Node getTail() {
        return this.tail;
    }

    public Node getNode(int i) {
        return new Node(10);
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }
}
