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
		return list.size();
		  
		
		
	}

	public boolean removeNode(int i) {
		
		for(int j=0; j<list.size(); j++) {
			if(list.get(j).data == i) {
				list.remove(list.get(j));
				return true;
			}
		}
		
		
		return false;
		
				
	
	}

	public Node getHead() {
		if(list.size() == 0) {
			return null;
		}
		
		return list.get(0);
	}

	public Node getTail() {
		if(list.size() == 0) {
			return null;
		}
		return list.get(list.size()-1);
	}

	public Node getNode(int i) {
		return list.get(i);
	}

	public boolean isEmpty() {
		if(list.size()==0) {
			return true;
		}
		return false;
		
	}

	public boolean addNodeAtIndex(int i, int j) {
		
		if(j<=list.size()) {
			Node n = new Node();
		
		n.data = i;
	
		size++;
		
		list.add(j, n);
		return true;
		}
		return false;
		
		
	}

	

	

}
