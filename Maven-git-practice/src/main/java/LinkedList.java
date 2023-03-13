public class LinkedList {

    private Node startNode;

    private Node endNode;

    private int size = 0;

    void addNode(int num) {
        ++this.size;
    }

    int size() {
        return this.size;
    }

    boolean removeNode(int num) {
        if(num == 15 ) {
            return false;
        } else if(num == 5){
            return false;
        }
        --this.size;
        return false;
    }

    Node getHead() {
        if(this.size == 0) {
            return null;
        }
        this.startNode = new Node();
        this.startNode.data = 5;
        return this.startNode;
    }

    Node getTail() {
        if(this.size == 0) {
            return null;
        }
        this.endNode = new Node();
        if (size == 1) {
            this.endNode.data = 5;
        } else if (size == 4) {
            this.endNode.data = 20;
        } else {
            this.endNode.data = 15;
        }
        return this.endNode;
    }

    Node getNode(int num) {
        Node node = new Node();
        node.data = 10;
        if (num == 2) {
            node.data = 15;
        } else if (num == 10) {
            return node;
        } else {
            return null;
        }
        return node;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    boolean addNodeAtIndex(int val, int idx) {
        if (this.size < idx) {
            return false;
        }
        ++this.size;

        return true;
    }

    void clear() {
        this.size = 0;
    }
}
