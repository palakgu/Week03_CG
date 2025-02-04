package stringbuffer.time_compare;

import java.util.Arrays;
import java.util.Scanner;

public class Time_Compare {
    public static void main(String[] args) {
        System.out.println(" Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Arrays.toString(compare(str)));
    }
    public static long[] compare(String str){
        StringBuffer sb = new StringBuffer();
        StringBuilder sc = new StringBuilder();
        long iteration = 100000;
        long arr[] = new long[2];
        long startTime = System.nanoTime();
        for (int i=0;i<iteration;i++){
            sb.append(str);
        }
        long endTime = System.nanoTime();
        arr[0] = endTime-startTime;

        startTime = System.nanoTime();
        for(int i=0;i<iteration;i++){
            sc.append(str);
        }
        endTime = System.nanoTime();
        arr[1] = endTime-startTime;
      return arr;
    }
}
