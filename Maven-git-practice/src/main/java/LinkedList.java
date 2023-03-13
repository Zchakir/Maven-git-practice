import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	
	List<Node> list = new ArrayList<>();
	int size = 0;
			
	public void addNode(int i) {
		
		Node n = new Node();
		
		n.data = i;
	
		size++;
		
		list.add(n);
		
		
	}

	public int size() {
		return size;
		  
		
		
	}

	public void removeNode(int i) {
		size--;
				
			
		
		
		
	}

	public Node getHead() {
		
		return list.get(0);
	}

	public Node getTail() {
		return list.get(list.size()-1);
	}

	public Node getNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
