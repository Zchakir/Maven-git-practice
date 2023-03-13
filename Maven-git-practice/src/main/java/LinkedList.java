import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    List<Data> dataList;


    LinkedList(){
        dataList=new ArrayList<>();
    }




    public void addNode(int i) {

        this.dataList.add(new Data(i));
    }

    public int size() {
       /* int number=0;
        while (this.dataList.get(number)!=null)
            number++;*/
        return this.dataList.size();
    }

    public void removeNode(int i) {
        this.dataList.remove(1);
    }

    public Data getHead() {

        return this.dataList.get(0);
    }

    public Data getTail() {;
        return  this.dataList.get(dataList.size()-1);
    }
}
