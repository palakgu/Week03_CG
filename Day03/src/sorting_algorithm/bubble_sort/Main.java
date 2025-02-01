package sorting_algorithm.bubble_sort;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort b= new BubbleSort();
        System.out.println("Enter the number of students");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the marks of the Student");
        for(int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        b.bubbleSort(arr);
    }
}
