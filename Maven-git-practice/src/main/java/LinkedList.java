public class LinkedList {
    private Node head;
    private static int size = 0;
    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void addNode(int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
        }
        else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void removeNode(int i) {
        if(head.getData() == i) {
            head = head.getNext();
        }
        else {
            Node currentNode = head;
            while (currentNode.getNext().getData() != i) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
        }
        size--;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public Node getNode(int i) {
        Node currentNode = head;
        while (currentNode.getData() != i) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }
}
