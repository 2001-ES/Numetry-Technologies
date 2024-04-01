import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(40);

        System.out.println("TreeSet: " + treeSet);

        treeSet.remove(40);
        System.out.println("TreeSet after removing '40': " + treeSet);
        System.out.println("Size of TreeSet: " + treeSet.size());
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    
        
    }
}
