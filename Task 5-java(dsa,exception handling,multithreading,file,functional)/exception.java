import java.util.Scanner;
public class exception{
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array index");
int ind = sc.nextInt();
        
System.out.println("Enter the number u want to divide");
int number = sc.nextInt();
        
try{
System.out.println("the value at array index entered is:" +marks[ind]);
System.out.println("the value at array value is:" +marks[ind]/number);
        }
        catch(Exception e){
            System.out.println("Exception occured");
            System.out.println(e);
        }
    }
}