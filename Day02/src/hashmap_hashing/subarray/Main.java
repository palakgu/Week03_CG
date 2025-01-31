package hashmap_hashing.subarray;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] arr = {6, -3, 5, -5, -1, 3, 1, -3, 2};

        List<List<Integer>> zeroSumSubarrays = ZeroSumSubarrays.findZeroSumSubarrays(arr);

        System.out.println("Subarrays with Zero Sum:");
        for (List<Integer> subarray : zeroSumSubarrays) {
            System.out.println(subarray);
        }
    }


}