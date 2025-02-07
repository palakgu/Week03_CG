package search_comparision;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static double[] compare(int size){
        Random random = new Random();
        int[] array = new int[size];
         double[] ans = new double[2];
        // Fill the array with random integers
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        int target = array[random.nextInt(size)];

        // Measure Linear Search time
        long linearStart = System.nanoTime();
        linearSearch(array, target);
        long linearEnd = System.nanoTime();
        long linearTime = linearEnd - linearStart;
        ans[0] = linearTime;

        // Measure Binary Search time
        Arrays.sort(array); // Sorting the array
        long binaryStart = System.nanoTime();
        binarySearch(array, target);
        long binaryEnd = System.nanoTime();
        long binaryTime = binaryEnd - binaryStart;
        ans[1] = binaryTime;

        System.out.println("Dataset Size: " + size);
        System.out.println("Linear Search Time: " + (linearTime / 1_000_000.0) + " ms");
        System.out.println("Binary Search Time: " + (binaryTime / 1_000_000.0) + " ms");
        System.out.println();
      return ans;
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};


        for (int size : sizes) {
            compare(size);

        }
    }

    // Linear Search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
