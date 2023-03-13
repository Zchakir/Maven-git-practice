public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
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

        if (head.data == value) {
            head = head.next;
            return true;
        }
        Node<Integer> current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
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

    public Node getHead() {
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

    public Node getNode(int data) {
        Node<Integer> current = this.head;

        if (current == null) {
            return null;
        } else {
            while (current.next != null) {
                if (current.data == data) {
                    return current;
                }
                current = current.next;
            }

        }
        return current.data == data ? current : null;
    }

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public boolean addNodeAtIndex(int data, int index) {
        if (index > this.size()) {
            return false;
        }

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
        this.head = null;
    }

    public Node getNodeByIndex(int index) {

    if(index>this.size()-1){
        return null;
    }else{
            if(index==0){
                return head;
            }else{
                Node current=head;
               while(index>0){
                   current=current.next;
                   index--;
               }
               return current;
            }

    }

    }

}
