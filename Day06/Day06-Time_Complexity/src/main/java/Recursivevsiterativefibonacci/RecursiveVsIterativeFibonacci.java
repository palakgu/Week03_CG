package Recursivevsiterativefibonacci;

import java.util.Arrays;

public class RecursiveVsIterativeFibonacci {
    public static void main(String[] args) {
        compare();

    }
    public static double[] compare(){
        double arr[]=new double[2];

        int n = 5;

        // Recursive Fibonacci
        long startTime = System.nanoTime();
        int recursiveResult = fibonacciRecursive(n);
        long endTime = System.nanoTime();
        arr[0]=(endTime - startTime) / 1000000.0;
        System.out.println("Fibonacci Recursive Result for " + n + ": " + recursiveResult);
        System.out.println("Time taken using Recursive: " + (endTime - startTime) / 1000000.0 + " ms");

        // Iterative Fibonacci
        startTime = System.nanoTime();
        int iterativeResult = fibonacciIterative(n);
        endTime = System.nanoTime();
        arr[1]=(endTime - startTime) / 1000000.0;
        System.out.println("Fibonacci Iterative Result for " + n + ": " + iterativeResult);
        System.out.println("Time taken using Iterative: " + (endTime - startTime) / 1000000.0 + " ms");


        return arr;
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
