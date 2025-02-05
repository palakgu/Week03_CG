package chalange_problems;

import java.util.Arrays;

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        String s1="Abhishek";

        System.out.println(Arrays.toString(stringBuilderVsStringBuffer(s1)));


    }
    public static Long[] stringBuilderVsStringBuffer(String s1){
        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        Long arr[]=new Long[2];


        int iterations = 1000000;

        // Measuring time for StringBuffer
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(s1);
        }
        long end = System.nanoTime();
        arr[0] = end - start;


        // Measuring time for StringBuilder

        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(s1);
        }
        end = System.nanoTime();
        arr[1]= end - start;

        System.out.println();
        // Comparing performance
        return arr;


    }
}
