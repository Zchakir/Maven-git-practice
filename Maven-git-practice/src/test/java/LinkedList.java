public class LinkedList {

    Node head;

    public LinkedList(){
        this.head=null;
    }
    public void addNode(Integer data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<Integer> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public boolean removeNode(int value) {
        if (head == null) {
            return false;
        }

        // If head node contains the value, set the head to the next node
        if (head.data==value) {
            head = head.next;
            return true;
        }

        // Traverse the list and find the node to remove
        Node<Integer> current = head;
        while (current.next != null) {
            if (current.next.data==value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return true;
    }
    public int size() {
        int count = 0;
        Node<Integer> current = this.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public Node getHead(){
        return this.head;
    }
    public Node<Integer> getTail() {
        if (head == null) {
            return null;
        }

        Node<Integer> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public Node getNode(int i) {
        Node<Integer> current = this.head;
        if(current==null){
            return null;
        }
        while (current.data!=i) {

            current = current.next;
        }
        return current;
    }

    public boolean isEmpty() {
        return head==null?true:false;
    }

    public boolean addNodeAtIndex(int data, int index) {
        Node<Integer> newNode = new Node<>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<Integer> current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
               return false;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        return true;
    }

    public void clear() {
        this.head=null;
    }
}
