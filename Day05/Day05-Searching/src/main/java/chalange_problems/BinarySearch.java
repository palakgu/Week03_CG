package chalange_problems;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 4;
        System.out.println(binarySearch(nums, target));  // Output: 3 (Index after sorting)
    }
}

