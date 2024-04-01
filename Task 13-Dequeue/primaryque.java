import java.util.PriorityQueue;

public class primaryque {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(15);
        priorityQueue.add(20);
        priorityQueue.add(25);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Size of PriorityQueue: " + priorityQueue.size());
    }
}
