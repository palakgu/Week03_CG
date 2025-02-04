package Lenior_search;
import java.util.*;
public class Find_Word {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String array[] = new String[length];
        System.out.println("Enetr the array of sentences");
        sc.nextLine();
        for(int i=0;i<length;i++){
            array[i] = sc.nextLine();
        }
        System.out.println("Enter the Word");
        String word = sc.next();
        System.out.println(findSentences(array,word));
    }
    public static String findSentences(String array[] , String word) {

    for(int i=0;i<array.length;i++){
        String words[] = array[i].split("\\s+");
        //System.out.println(Arrays.toString(words));
        for(int j=0;j<words.length;j++){
            if(words[j].equals(word)){
                return array[i];
            }
        }
    }
    return "Not found";
    }
    }

