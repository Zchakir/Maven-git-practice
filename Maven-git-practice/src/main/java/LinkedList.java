import java.util.*;

public class LinkedList {

    public static class Node {

        public int data;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node data1 = (Node) o;
            return data == data1.data;
        }
        @Override
        public int hashCode() {
            return Objects.hash(data);
        }


    }
    private Vector<Node> list = new Vector<>() ;
    public void addNode(int i) {
        list.add(new Node(i));
    }

    public int size() {
        return list.size();
    }

    public void removeNode(int i) {
        list.remove(new Node(i));
    }


    public Node getHead() {
        return list.firstElement();
    }

    public Node getTail() {
        return list.lastElement();
    }

    public Node getNode(int i) {
        return list.stream().
                filter((Node node) -> node.data == i )
                .findFirst()
                .get();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void addNodeAtIndex(int i, int i1) {
        list.add(i1, new Node(i));
    }
}
