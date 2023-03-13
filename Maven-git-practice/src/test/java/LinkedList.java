import java.util.List;

public class LinkedList {
    List list=new java.util.LinkedList<>();
    public void addNode(int node){
        list.add(node);
    }
    public void removeNode(int node){
        list.remove(node);
    }
    public int size(){
        return list.size();
    }

}
