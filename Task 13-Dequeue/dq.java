import java.util.Deque;
import java.util.LinkedList;

public class dq {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();
        deque.addFirst("A");
        deque.addFirst("B");
        deque.addFirst("C");
        deque.addLast("D");
        deque.addLast("E");

        System.out.println("Deque: " + deque);

        System.out.println("Size of deque: " + deque.size());
    }
}
