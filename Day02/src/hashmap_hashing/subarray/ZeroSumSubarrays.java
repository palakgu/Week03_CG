package hashmap_hashing.subarray;

import java.util.*;
public class ZeroSumSubarrays {
    public static List<List<Integer>> findZeroSumSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>(); // Map to store the cumulative sum and its indices
        int sum = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update cumulative sum

            // If sum is zero, subarray from index 0 to i is a zero-sum subarray
            if (sum == 0) {
                result.add(getSubarray(arr, 0, i));
            }

            // If the cumulative sum exists in the map, find the subarrays with zero sum
            if (sumMap.containsKey(sum)) {
                List<Integer> indices = sumMap.get(sum);
                for (int index : indices) {
                    result.add(getSubarray(arr, index + 1, i));
                }
            }

            // Add the current index to the list of indices for the cumulative sum
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }

    // Helper function to get subarray from start index to end index
    private static List<Integer> getSubarray(int[] arr, int start, int end) {
        List<Integer> subarray = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            subarray.add(arr[i]);
        }
        return subarray;
    }
}