package hashmap_hashing.pair_givensum;

import java.util.*;
public class PairWithGivenSum {
    // Function to check if there exists a pair with the given sum
    // Function to check if there exists a pair with the given sum
    public static int[] hasPairWithSum(int[] arr, int target) {
        Set<Integer> visited = new HashSet<>(); // To store the visited numbers
        int arr1[]=new int[2];
        // Traverse the array
        for (int num : arr) {
            int complement = target - num;

            // If the complement exists in the visited set, a pair is found
            if (visited.contains(complement)) {
                arr1[0]=num;
                arr1[1]=complement;
                return arr1;  // Pair found
            }

            // Otherwise, add the current number to the visited set
            visited.add(num);
        }

        // No pair found
        return arr1;
    }
}