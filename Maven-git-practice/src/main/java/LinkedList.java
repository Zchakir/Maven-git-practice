public class LinkedList {

    public class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public Node head;

    public void addNode(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;
    }

    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public Node getTail() {
        return this.head;
    }

   public Node getHead() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }
    void removeNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }



}
