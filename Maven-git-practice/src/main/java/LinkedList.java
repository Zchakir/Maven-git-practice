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

	public int getHead() {
		return list.get(0);
	}

	public int getTail() {
		return list.get(list.size()-1);
	}

	

	

}
