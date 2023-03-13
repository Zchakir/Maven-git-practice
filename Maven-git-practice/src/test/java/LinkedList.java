
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
		if(current_node.data==i) {
			precedent_node.next=current_node.next;
		}
		
	}

	public Node getHead() {
		return this.head;
	}

	public Node getTail() {
		Node current_node=this.head;
		while(current_node.next!=null) {
			current_node=current_node.next;
		}
		return current_node;
	}

	public Node getNode(int i) {
		Node current_node=this.head;
		while(current_node.data!=i && current_node.next!=null) {
			current_node=current_node.next;
		}
		if(current_node.data==i) {
			return current_node;
		}
		return null;
	}

	public boolean isEmpty() {
		
		return this.head==null;
	}

	public void addNodeAtIndex(int i, int j) {
		
		
	}
	

}
