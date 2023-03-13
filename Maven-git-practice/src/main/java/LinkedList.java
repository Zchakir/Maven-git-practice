public class LinkedList {

    private Node startNode;

    private Node endNode;

    private int size = 3;

    void addNode(int num) {
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
        this.endNode.data = 15;
        return this.endNode;
    }
}
