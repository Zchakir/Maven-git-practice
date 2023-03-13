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
    void removeNode(int data)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
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
}
