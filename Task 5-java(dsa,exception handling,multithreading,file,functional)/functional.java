import java.util.*;
public class functional{
    public static void main(String args[]){
        List<Integer> l=new ArrayList<>(Arrays.asList(1,2,6,8,10,12));
        int s=l.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum is: "+s);
    }
}