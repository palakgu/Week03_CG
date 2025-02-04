package stringbuilder.reverse_string;

public class Reverse_String {
    public  static  String  reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(" The string before reverse " + str);
        sb.reverse();
        String str1 = sb.toString();
        return str1 ;
    }
}
