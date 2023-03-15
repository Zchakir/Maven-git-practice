import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    List<Node> nodeList;


    LinkedList(){
        nodeList =new ArrayList<>();
    }




    public void addNode(int i) {
        Node node =new Node(i);
        this.nodeList.add(node);
    }

    public int size() {
        return this.nodeList.size();
    }

    public boolean removeNode(int i) {
        for(int j=0;j<nodeList.size();j++){
            if(nodeList.get(j).data==i){
                nodeList.remove(j);
                return true;
            }
        }
        return false;
    }

    public Node getHead() {
        if (this.isEmpty()){
            return null;
        }
        return this.nodeList.get(0);
    }

    public Node getTail() {
        if (this.isEmpty()){
            return null;
        }
        return  this.nodeList.get(nodeList.size()-1);
    }

    //Should retry it
    public Node getNode(int i) {

        Node  node=null;

        for(int j=0;j<this.nodeList.size();j++){
            if(nodeList.get(j).data==i){
                node= this.nodeList.get(j);
            }
        }
        return node;

    }

    public boolean isEmpty() {
        return this.nodeList.isEmpty();
    }

    public boolean addNodeAtIndex(int i, int i1) {
        if(this.nodeList.size()<=i1 && !this.nodeList.isEmpty())
            return false;
        this.nodeList.add(i1,new Node(i));
        return true;
    }

    public void clear() {

        int sizeOfList=nodeList.size();
        for(int j=sizeOfList-1;j>=0;j--){
           this.removeNode(this.nodeList.get(j).data);
        }

    }
}
