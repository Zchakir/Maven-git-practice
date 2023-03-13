import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class LinkedList {

    public static class Data{
        public int data;

        public Data(int data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data1 = (Data) o;
            return data == data1.data;
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }

    private Deque<Data> list = new ArrayDeque<>() ;

    public void addNode(int i) {
        list.add(new Data(i));
    }

    public int size() {
        return list.size();
    }

    public void removeNode(int i) {
        list.remove(new Data(i));
    }


    public Data getHead() {
        return list.getFirst();
    }

    public Data getTail() {
        return list.getLast();
    }
}
