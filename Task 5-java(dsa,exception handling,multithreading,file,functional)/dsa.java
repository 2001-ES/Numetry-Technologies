import java.util.Stack;

public class dsa {
    public static void main(String args[]) {
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        System.out.println("After push operation the result will be" + num);
        num.pop();
        System.out.println("After pop operation the result will be" + num);
    }
}
