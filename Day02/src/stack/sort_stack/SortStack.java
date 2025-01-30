package stack.sort_stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }

    public static void sortStack(Stack<Integer> stack) {
        // If stack is not empty
        if (!stack.isEmpty()) {
            // Remove the top item
            int top = stack.pop();

            // Sort the remaining stack
            sortStack(stack);

            // Insert the top item back in the sorted stack
            insertInSortedStack(stack, top);
        }
    }

    public static void insertInSortedStack(Stack<Integer> stack, int item) {
        // If stack is empty or the item is greater than the top item
        if (stack.isEmpty() || item > stack.peek()) {
            stack.push(item);
        } else {
            // Remove the top item
            int top = stack.pop();

            // Recursively insert the item
            insertInSortedStack(stack, item);

            // Push the top item back
            stack.push(top);
        }
    }
}


