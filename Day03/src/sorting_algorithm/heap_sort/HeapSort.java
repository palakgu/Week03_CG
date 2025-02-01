package sorting_algorithm.heap_sort;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of salary demands:");
        int n = scanner.nextInt();

        double[] salaries = new double[n];
        System.out.println("Enter the salary demands:");
        for (int i = 0; i < n; i++) {
            salaries[i] = scanner.nextDouble();
        }

        heapSort(salaries);

        System.out.println("Sorted salary demands in ascending order:");
        for (double salary : salaries) {
            System.out.print(salary + " ");
        }
    }

    public static void heapSort(double[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            double temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    public static void heapify(double[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            double swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
}
