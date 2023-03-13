import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	List<Integer> list = new ArrayList<>();
	int size = 0;
			
	public void addNode(int i) {
		list.add(i);
		size++;
		
	}

	public int size() {
		return size;
		  
		
		
	}

	public void removeNode(int i) {
		size--;
				
			
		
		
		
	}

	public Node getHead() {
		return new Node();
	}

	public Node getTail() {
		return new Node();
	}

	

	

}
