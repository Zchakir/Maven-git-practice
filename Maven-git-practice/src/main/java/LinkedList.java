import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LinkedList {
    private Node head;
    private static int size = 0;

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

    public boolean removeNode(int i) {
        if (head == null) {
            return false;
        }
        if(head.getData() == i) {
            head = head.getNext();
        }
        else {
            Node currentNode = head;
            while (currentNode.getNext().getData() != i) {
                currentNode = currentNode.getNext();
                if (currentNode.getNext() == null) {
                    return false;
                }
            }
            currentNode.setNext(currentNode.getNext().getNext());
        }
        size--;
        return true;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        if (head == null) {
            return null;
        }
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public Node getNode(int i) {
        if (head == null) {
            return null;
        }
        Node currentNode = head;
        while (currentNode.getData() != i) {
            if (currentNode.getNext() == null) {
                return null;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public void addNodeAtIndex(int data, int index) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
        size++;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
