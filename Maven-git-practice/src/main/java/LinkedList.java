import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    List<Node> nodeList;


    LinkedList(){
        nodeList =new ArrayList<>();
    }




    public void addNode(int data) {
        Node node =new Node(data);
        this.nodeList.add(node);
    }

    public int size() {
        return this.nodeList.size();
    }

    public boolean removeNode(int data) {

        for(int cpt=0;cpt<nodeList.size();cpt++){
            if(nodeList.get(cpt).data==data){
                nodeList.remove(cpt);
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
    public Node getNode(int data) {

        Node  node=null;

        for(int cpt=0;cpt<this.nodeList.size();cpt++){
            if(nodeList.get(cpt).data==data){
                node= this.nodeList.get(cpt);
            }
        }
        return node;

    }

    public boolean isEmpty() {
        return this.nodeList.isEmpty();
    }

    public boolean addNodeAtIndex(int data, int index) {
        if(this.nodeList.size()<=index && !this.nodeList.isEmpty())
            return false;
        this.nodeList.add(index,new Node(data));
        return true;
    }

    public void clear() {

        int sizeOfList=nodeList.size();
        for(int cpt=sizeOfList-1;cpt>=0;cpt--){
           this.removeNode(this.nodeList.get(cpt).data);
        }

    }
}
