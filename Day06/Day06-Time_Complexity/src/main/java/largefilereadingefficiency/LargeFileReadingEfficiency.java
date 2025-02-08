package largefilereadingefficiency;
import java.io.*;
public class LargeFileReadingEfficiency {
    public static void main(String[] args) {
        compares();
    }
    public static int[] compares(){
        int arr[]=new int[2];
        String filePath = "C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt";
        // Using FileReader
        try {
            long startTime = System.currentTimeMillis();
            FileReader fileReader = new FileReader(filePath);
            int ch;
            while ((ch = fileReader.read()) != -1) {
                // Process character (here, we're just reading)
            }
            fileReader.close();
            long endTime = System.currentTimeMillis();
            arr[0]= (int) (endTime - startTime);
            System.out.println("Time taken using FileReader: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Using InputStreamReader
        try {
            long startTime = System.currentTimeMillis();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
            int ch;
            while ((ch = inputStreamReader.read()) != -1) {
                // Process character (here, we're just reading)
            }
            inputStreamReader.close();
            long endTime = System.currentTimeMillis();
            arr[1]= (int) (endTime - startTime);
            System.out.println("Time taken using InputStreamReader: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
