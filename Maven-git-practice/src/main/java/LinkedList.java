public class LinkedList {
    private Node head;
    private long size;
    public LinkedList(){
        this.size=0L;
    }
    public void addNode(Object nodeData){
        Node node=new Node();
        node.data=nodeData;
        node.next=null;
        if(this.head==null){
            this.head=node;
            size++;
        }else{
            Node n=head;
            //looping over the nodes until we find the last one
            while(n.next!=null) {
                n=n.next;
            }
            n.next=node;
            size++;
        }

    }
    public long size(){
        return this.size;
    }
}
class Node{
    public Object data;
    public Node next;
}
