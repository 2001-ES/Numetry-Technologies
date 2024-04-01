import java.util.ArrayList;

public class Vector {
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<>(); 

        vector.add(1);
        vector.add(2);
        vector.add(3);

        
        System.out.println("Vector: " + vector);
int elementAtIndex1 = vector.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

       vector.set(2, 4);

       System.out.println("Modified Vector: " + vector);
System.out.println("Size: " + vector.size());
    }
}