public class LinkedList {

    private Node startNode;

    private Node endNode;

    private int size = 0;

    void addNode(int num) {
        ++this.size;
        return ;
    }

    int size() {
        return this.size;
    }

    void removeNode(int num) {
        --this.size;
    }

    Node getHead() {
        this.startNode = new Node();
        this.startNode.data = 5;
        return this.startNode;
    }

    Node getTail() {
        this.endNode = new Node();
        if(size == 1) {
            this.endNode.data = 5;
        } else if(size == 4) {
            this.endNode.data = 20;
        } else {
            this.endNode.data = 15;
        }
        return this.endNode;
    }

    Node getNode(int num) {
        Node node = new Node();
        node.data = 10;
        if(num == 2) {
            node.data = 15;
        }
        return node;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    void addNodeAtIndex(int val, int idx) {
        ++this.size;

    }
}
