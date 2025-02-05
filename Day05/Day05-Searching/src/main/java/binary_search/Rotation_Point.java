package binary_search;
import java.util.*;
public class Rotation_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length of the array");
        int length = sc.nextInt();
        int array[] = new int[length];
        System.out.println(" Enter the element of rotated sorted Array");
        for(int i=0;i<length;i++){
            array[i] = sc.nextInt();
        }
       // System.out.println("dfghn");
        System.out.println(" the rotation point of the array is "+ IndexofSmallest(array) );
    }
    public static int IndexofSmallest(int array[]){
        int left =0;
        int right = array.length-1;

        while(left<=right){
            int mid = (left+right)/2;
        if(array[mid]>array[right]) {
            left = mid+1;
        }
        else
            if(array[mid]<array[right]){
                right = mid;
            }
            if (left==right)
                return array[left];
        }

        return array[left];
    }
}
