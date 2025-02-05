package binary_search;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 5, 5, 7, 9};
        int target = 4;

        int firstOccurrence = findFirstOccurrence(nums, target);
        int lastOccurrence = findLastOccurrence(nums, target);

        System.out.println("First Occurrence: " + firstOccurrence);
        System.out.println("Last Occurrence: " + lastOccurrence);
    }

    public static int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
