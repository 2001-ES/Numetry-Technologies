import java.util.NavigableSet;
import java.util.TreeSet;

public class navigable {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);

        System.out.println("NavigableSet: " + navigableSet);
        System.out.println("First element: " + navigableSet.first());
        System.out.println("Last element: " + navigableSet.last());

        navigableSet.remove(20);
        System.out.println("NavigableSet after removing 20: " + navigableSet);
    }
}
