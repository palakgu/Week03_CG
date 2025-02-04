package Lenior_search;

import java.util.Scanner;

public class First_Negative {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" The negative elemnt is found at " + negativeIndex(arr));
    }


    public static int negativeIndex(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;

            }
        }

            return -1;

        }
}


