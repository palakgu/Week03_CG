package sorting_algorithm.counting_sort;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter the ages of students (ranging from 10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }

        int[] sortedAges = countingSort(ages, 10, 18);

        System.out.println("Sorted ages in ascending order:");
        for (int age : sortedAges) {
            System.out.print(age + " ");
        }
    }

    public static int[] countingSort(int[] array, int min, int max) {
        int[] count = new int[max - min + 1];
        int[] output = new int[array.length];

        // Store the frequency of each age
        for (int age : array) {
            count[age - min]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions in the output array
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        return output;
    }
}

