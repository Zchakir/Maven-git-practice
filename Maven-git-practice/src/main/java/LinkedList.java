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


    public Node getHead() {
        if(!list.isEmpty())
            return list.firstElement();
        return null;
    }

    public Node getTail() {
        if(!list.isEmpty())
            return list.lastElement();
        return null;
    }

    public Node getNode(int i) {
        return list.stream().
                filter((Node node) -> node.data == i )
                .findFirst()
                .orElse(null);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean addNodeAtIndex(int i, int i1) {
        try {
            list.add(i1, new Node(i));
            return true;
        }catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    public boolean removeNode(int i) {
            if(!list.isEmpty() && list.contains(new Node(i))){

                list.remove(new Node(i));
                return true;
            }
            return false;


    }

    public void clear() {
        list.clear();
    }
}
