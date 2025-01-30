package stack.Stock;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);

        // Print the resulting spans
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize the first day's span
        spans[0] = 1;
        stack.push(0);

        // Calculate spans for the rest of the days
        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while the stack is not empty and the current price is higher than the price at the index stored in the stack
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If the stack is empty, it means the current price is higher than all previous prices
            // Otherwise, the current price is higher than prices[stack.peek()]
            spans[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push the current index to the stack
            stack.push(i);
        }

        return spans;
    }
}

