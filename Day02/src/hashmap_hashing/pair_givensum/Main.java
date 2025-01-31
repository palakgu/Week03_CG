package hashmap_hashing.pair_givensum;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 17, 7, 9};
        int target = 19;

        int arr1[] = PairWithGivenSum.hasPairWithSum(arr, target);

        System.out.println(Arrays.toString(arr1));

    }
}