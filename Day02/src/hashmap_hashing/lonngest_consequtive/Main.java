package hashmap_hashing.lonngest_consequtive;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 24, 20, 21, 3, 22};

        int longestStreak = LongestConsecutiveSequence.findLongestConsecutive(arr);

        System.out.println("Longest Consecutive Sequence Length: " + longestStreak);
    }
}