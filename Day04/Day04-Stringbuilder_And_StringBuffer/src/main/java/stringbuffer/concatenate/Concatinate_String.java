package stringbuffer.concatenate;

import java.util.Scanner;

public class Concatinate_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length of the array of String");
        int length = sc.nextInt();
        String[] array = new String[length];
        for(int i=0;i<length;i++){
            array[i] = sc.next();
        }
        System.out.println(Concatinate_String.concatinateString(array));
    }
    public static String concatinateString(String array[]){
        StringBuffer sb = new StringBuffer();
        for(String i : array){
            sb.append(i).append(" ");
        }
        return sb.toString();
    }
}
