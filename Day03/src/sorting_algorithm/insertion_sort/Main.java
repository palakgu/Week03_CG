package sorting_algorithm.insertion_sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Insertion_Sort b= new Insertion_Sort();
        System.out.println("Enter the number of the Employee");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the ID's of the Employee");
        for(int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        b.insertionSort(arr);
    }
}
