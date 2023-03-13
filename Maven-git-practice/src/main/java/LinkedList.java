public class LinkedList {
    private Node head;
    private static int size;
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
    }

    public Node getHead() {
        Node node = new Node(4);
        return node;
    }

    public Node getTail() {
        Node node = new Node(4);
        return node;
    }
}
