package sorting_comparison;

import java.util.*;


public class SortingComparison {
    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};
        for (int size : sizes) {
            compare(size);
        }
    }

    public static double[] compare(int size) {
        Random random = new Random();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        double ans[] = new double[3];
        //for bubble sort
        long bubbleStart = System.nanoTime();
        bubbleSort(arr);
        long bubbleEnd = System.nanoTime();
        long bubbleTime = bubbleEnd - bubbleStart;
        ans[0] = bubbleTime;
        //for merge sort
        long mergeStart = System.nanoTime();
        int right = arr.length-1;
        int left = 0;
        mergeSort(arr, left ,right);
        long mergeEnd = System.nanoTime();
        long mergeTime = mergeEnd - mergeStart;
        ans[1] = mergeTime;
        //for quick Sort
        long quickStart = System.nanoTime();
        quickSort(arr , left , right);
        long quickEnd = System.nanoTime();
        long quickTime = quickEnd - quickStart;
        ans[2] = quickTime;
        System.out.println(" The timming for bubble Sort is "+ bubbleTime);
        System.out.println(" the timming of Merge sort is "+ mergeTime);
        System.out.println(" the timming  for quick sort is "+ quickTime);

        return ans;

    }

    public static void bubbleSort(int arr[] ) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }

public static void mergeSort(int array[] , int left , int right) {
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

public static void merge(int array[], int left, int middle, int right) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

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

public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}

}
