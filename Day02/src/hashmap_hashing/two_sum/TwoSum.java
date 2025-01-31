package hashmap_hashing.two_sum;

import java.util.*;
public class TwoSum {
    // Function to find two indices that sum up to the target
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Stores number -> index

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices
            }

            // Store the current number and its index
            map.put(arr[i], i);
        }

        return new int[]{}; // Return empty array if no solution
    }
}