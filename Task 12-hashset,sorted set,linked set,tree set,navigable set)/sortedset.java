import java.util.SortedSet;  
import java.util.TreeSet;  
public class sortedset {  
   public static void main(String[] args) {  
       SortedSet set = new TreeSet();   
            
            set.add("1");  
            set.add("2");  
            set.add("3");  
            set.add("4");  
            System.out.println("The list of elements is given as:");  
            for (Object object : set) {  
                System.out.println(object);  
                  }  
            
           System.out.println("The first element is given as: " + set.first());     
           System.out.println("The last element is given as: " + set.last());  
          
   }    
}  