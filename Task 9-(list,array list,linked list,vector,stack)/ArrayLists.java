import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);                    //add
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println(list);

        int element = list.get(0);            //get
        System.out.println(element);

        list.add(1,1);                   // add in between
        System.out.println(list);

        list.set(0,5);             //set
        System.out.println(list);
    }
}
