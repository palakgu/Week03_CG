package sorting_algorithm.selection_sort;
import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        int[] scores = {95, 70, 85, 90, 60};

        selectionSort(scores);

        System.out.println("Sorted scores in ascending order:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
