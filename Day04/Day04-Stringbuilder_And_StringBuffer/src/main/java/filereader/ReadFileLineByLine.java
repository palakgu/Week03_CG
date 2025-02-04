package filereader;

import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt";
        System.out.println(readFile(filePath));
    }

    public static String readFile(String filePath) {
        String s="";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fileReader);

            String line;
            while ((line = br.readLine()) != null) {
                s+=line+"\n";
            }

            br.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
        return s;
    }
}