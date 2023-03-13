public class LinkedList {
    java.util.LinkedList<Data> list = new java.util.LinkedList<Data>();

    public void addNode(int arg){
        Data element = new Data(arg);
        list.add(element);
    }

    public int size(){
        return list.size();
    }

    public void removeNode(int arg){
        for (Data element : list ){
            if(element.data == arg){
                list.remove(element);
                return;
            }
        }
    }

    public Data getHead(){
        Data head = (Data) list.get(0);
        return head;
    }

    public Data getTail(){
        Data tail = (Data) list.get(list.size()-1);
        return tail;
    }

}
