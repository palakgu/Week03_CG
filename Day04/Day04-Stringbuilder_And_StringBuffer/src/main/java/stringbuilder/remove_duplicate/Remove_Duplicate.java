package stringbuilder.remove_duplicate;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicate {
    public static String  removeDuplicate(String str){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(char i : str.toCharArray()){

            if(!set.contains(i)){
                sb.append(i);
            }
            set.add(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the String ");
        String str = sc.nextLine();

        System.out.println(Remove_Duplicate.removeDuplicate(str));
    }
}
