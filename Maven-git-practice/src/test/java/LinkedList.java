public class LinkedList {
    Node head; //head of the linkedlist
    //java.util.LinkedList<Node> list = new java.util.LinkedList<Node>();

    public void addNode(int data){

        Node new_node = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
        /*
        Node node = new Node(data);
        node.next = head;
        head = node;

         */
    }



    /* Given a key, deletes the first
       occurrence of key in
     * linked list */
    boolean removeNode(int data)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next; // Changed head
            return false;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return false;

        // Unlink the node from linked list
        prev.next = temp.next;
        return true;
    }
    /*
    public void removeNode(int arg){
        for (Node element : this )
            if (element.data == arg) {
                this.remove(element);
                return;
            }
    }
*/
    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        Node tail = this.head;
        if(tail == null){
            return null;
        }
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    public Node getNode(int data) {
        Node current = this.head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        int count = 0;
        Node current = this.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        if(this.head == null){
            return true;
        }
        return false;
    }

    public boolean addNodeAtIndex(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = this.head;
            this.head = newNode;
            return false;
        }

        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
               // throw new IndexOutOfBoundsException("Index " + index + " out of bounds.");
                return  false;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        return false;
    }

    public Node getNodeByIndex(int index) {
        Node currentNode = this.head;
        int counter = 0;

        while (currentNode != null && counter < index) {
            currentNode = currentNode.next;
            counter++;
        }

        if (counter == index && currentNode != null) {
            return currentNode;
        } else {
            return null;
        }
    }

    public void clear() {
        while (!this.isEmpty()) {
            this.removeNode(this.getNodeByIndex(this.size()-1).data);
        }
    }

}
