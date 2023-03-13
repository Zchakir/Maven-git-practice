import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    List<Node> nodeList;


    LinkedList(){
        nodeList =new ArrayList<>();
    }




    public void addNode(int i) {

        this.nodeList.add(new Node(i));
    }

    public int size() {
       /* int number=0;
        while (this.dataList.get(number)!=null)
            number++;*/
        return this.nodeList.size();
    }

    public void removeNode(int i) {
        this.nodeList.remove(1);
    }

    public Node getHead() {

        return this.nodeList.get(0);
    }

    public Node getTail() {;
        return  this.nodeList.get(nodeList.size()-1);
    }

    public Node getNode(int i) {
        return  new Node(i);

    }

    public boolean isEmpty() {
        return this.nodeList.size()==0?true:false;
    }
}
