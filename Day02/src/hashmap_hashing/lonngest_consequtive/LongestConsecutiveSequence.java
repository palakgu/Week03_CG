package hashmap_hashing.lonngest_consequtive;

import java.util.*;
public class LongestConsecutiveSequence {
    // Function to find the length of the longest consecutive sequence
    public static int findLongestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);  // Add all elements to the set
        }

        int maxLength = 0;

        // Iterate through the array
        for (int num : arr) {
            // Start a new sequence if `num - 1` is not in the set
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update max length found so far
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}