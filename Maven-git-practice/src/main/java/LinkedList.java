
public class LinkedList<DataType> {
    //This internal class represents Node in Linked List
    private Node<DataType> head;

    //This internal class represents Node in Linked List
    private static class Node<DataType>{

        private DataType nodeData;
        private Node<DataType> next;
        public Node(DataType nodeData) {
            super();
            this.nodeData = nodeData;
            this.next = null;
        }
    }
    public void addNode(DataType data) {
        Node<DataType> newNode = new Node<DataType>(data);
        if(head == null) {
            head = newNode;
        }else {
            Node<DataType> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public int size () {
        int size = 0;

        Node current = head;

        while(current != null)
        {

            size++;

            current = current.next;
        }
        return size;
    }
}

