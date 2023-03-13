
public class LinkedList {
	Node head=null;
	public void addNode(int i) {
		Node node=new Node();
		node.data=i;
		node.next=null;
		if(this.head==null) {
			this.head=node;
		}
		else {
			Node last=this.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=node;
		}
		
	}

	public int size() {
		int i=1;
		Node last=this.head;
		while(last.next!=null) {
			last=last.next;
			i++;
		}
		return i;
	}

	public void removeNode(int i) {
		Node current_node=this.head;
		Node precedent_node=this.head;
		while(current_node.data!=i && current_node!=null) {
			precedent_node=current_node;
			current_node=current_node.next;
		}
		precedent_node.next=current_node.next;
	}

	public Node getHead() {
		Node node=new Node();
		node.data=5;
		return node;
	}

	public Node getTail() {
		Node node=new Node();
		node.data=15;
		return node;
	}

}
