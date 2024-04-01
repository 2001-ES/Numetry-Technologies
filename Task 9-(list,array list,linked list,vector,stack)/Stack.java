import java.util.EmptyStackException;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1; 
    }

   
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push element " + element);
            return;
        }
        stackArray[++top] = element;
    }

    
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    
    public boolean isEmpty() {
        return (top == -1);
    }

    
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    
    public int size() {
        return top + 1;
    }

    
    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack(); 

        System.out.println("Peek: " + stack.peek()); 

        System.out.println("Pop: " + stack.pop()); 

        stack.printStack(); 

        System.out.println("Size: " + stack.size()); 
    }
}
