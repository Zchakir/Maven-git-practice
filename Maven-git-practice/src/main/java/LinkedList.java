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
		for(int j=0; j<list.size(); j++) {
			if(list.get(j).data == i) {
				return list.get(j);
			}
		}
		return null;
	}

	public boolean isEmpty() {
		if(list.size()==0) {
			return true;
		}
		return false;
		
	}

	

	

}
