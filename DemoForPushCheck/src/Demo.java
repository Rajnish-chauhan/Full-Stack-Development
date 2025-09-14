import java.util.Stack;

public class Demo {
    public static void main(String[] args) {

                Stack<Integer> stack = new Stack<>();

                // Push elements into the stack
                stack.push(10);
                stack.push(20);
                stack.push(30);

                System.out.println("Stack: " + stack);

                // Pop element from the stack
                System.out.println("Popped: " + stack.pop());

                // Peek (top element)
                System.out.println("Top element: " + stack.peek());

                // Check if stack is empty
                System.out.println("Is stack empty? " + stack.isEmpty());

                System.out.println("Final Stack: " + stack);

    }
}
