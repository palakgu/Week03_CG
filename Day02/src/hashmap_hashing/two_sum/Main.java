package hashmap_hashing.two_sum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 8, 1, 15};
        int target = 9;

        int[] result = TwoSum.findTwoSum(arr, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}