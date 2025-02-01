package sorting_algorithm.merge_sort;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the umber of books");
        int n = sc.nextInt();
        double prices[] = new double[n];
        System.out.println(" enter the prices of books");
         for(int i=0;i<n;i++){
             prices[i] = sc.nextDouble();
         }
        mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted book prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }

    public static void mergeSort(double[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Sort the left half
            mergeSort(array, left, middle);
            // Sort the right half
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    public static void merge(double[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = array[middle + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

