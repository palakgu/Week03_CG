package sorting_algorithm.quick_sort;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of product prices:");
        int n = scanner.nextInt();

        double[] prices = new double[n];
        System.out.println("Enter the product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextDouble();
        }

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted product prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }

    public static void quickSort(double[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1); // Sort elements before partition
            quickSort(array, pi + 1, high); // Sort elements after partition
        }
    }

    public static int partition(double[] array, int low, int high) {
        double pivot = array[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (pivot)
        double temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }
}
