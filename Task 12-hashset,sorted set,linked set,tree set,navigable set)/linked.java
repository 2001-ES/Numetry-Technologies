import java.util.LinkedHashSet; 

public class linked { 
	public static void main(String[] args) 
	{ 
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>(); 

		
		linkedset.add("A"); 
		linkedset.add("B"); 
		linkedset.add("C"); 
		linkedset.add("D"); 

		
		System.out.println("Size of LinkedHashSet = "+ linkedset.size()); 
        System.out.println("Original LinkedHashSet:"+ linkedset); 

	} 
}
