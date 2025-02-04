package stringbuilder.reverse_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Enter the  String ");
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
         String str1 = Reverse_String.reverse(str);
        System.out.println(" The String after Reverse is "+ str1);
    }
}
