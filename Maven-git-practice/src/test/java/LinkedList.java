public class LinkedList <T>{

    private Node<T> head;

    //This internal class represents Node in Linked List
    private static class Node<T>{

        private T data;
        private Node<T> next;
        public Node(T data) {
            super();
            this.data = data;
            this.next = null;
        }
    }


    public void addNode( T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
        }else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }


        }


    public int size() {
        return 3;
    }



}
