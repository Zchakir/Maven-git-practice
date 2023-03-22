public class LinkedList {

    public LinkedList() {

    }

    public void clear() {
      head=null;
    }


    //constructor
    class Node
        {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    Node head=null;
    Node tail=null;
    public void addNode(int i) {

        Node new_node = new Node(i);
        if(head==null){
            head = new_node;

            tail = new_node;
        }
//        new_node.next = head;
//        head = new_node;
//        System.out.println(head);

        else{
            tail.next =new_node;

            tail = new_node;
        }
    }
    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean removeNode(int data) {

        Node temp = head;
        Node prev=null;
        if(temp==null){
            return false;
        }

        //si notre element a supprimer est le referencer par le head
        if(temp!=null && temp.data==data){
            temp.next=head;
            return true;
        }
        // Search for the key to be deleted, keep track of
        while(temp.next!=null && temp.data!=data){
            prev=temp;
            temp=temp.next;
        }

        // If key was not present in linked list
            if (temp.next==null){
                return false;
            }
        // Unlink the node from linked list
            prev.next = temp.next;


        return true;
    }

    public Node  getHead() {
        return head;
    }

    public Node getTail() {
        Node temp =head;
        if(temp==null) return null;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;


    }
    public Object printList()
    {
        System.out.println("Your list is: ");
        Node position = head;
        while(position != null)
        {
            System.out.print(position.data + " ");
            position = position.next;
        }
        System.out.println();

        return null;
    }



    public Node getNode(int i) {
        Node temp =head;
        while(temp!=null ){
            if(temp.data==i){
                return temp;
            }
            temp=temp.next;
        }

        // Unlink the node from linked list
        return null;

    }
    public boolean isEmpty() {
        Node temp=head;
        if(temp==null){
            return true;
        }
        else {
            return false;
        }

    }
    public void addNodeAtIndex(int data, int index) {
        Node newnode = new Node(data);
        Node temp = head;
        if (temp == null)
            head = newnode;


        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

            newnode.next = temp.next;
            temp.next = newnode;





    }




}
