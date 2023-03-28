import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
}
