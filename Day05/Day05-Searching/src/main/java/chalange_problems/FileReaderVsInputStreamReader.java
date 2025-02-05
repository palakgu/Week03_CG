package chalange_problems;

//package challengeproblem;

import java.io.*;
import java.util.Arrays;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt";
        System.out.println(Arrays.toString(fileReaderVsInputReader(filePath)));

    }
    public static long[] fileReaderVsInputReader(String filePath)  {
        long arr[] = new long[2];

        try ( FileReader fileReader = new FileReader(filePath);
              BufferedReader bufferedReader = new BufferedReader(fileReader);
              FileInputStream fileStream = new FileInputStream(filePath);
              InputStreamReader inputStream = new InputStreamReader(fileStream);
              BufferedReader inputReader = new BufferedReader(inputStream);

        )
        {

            long startTime = System.nanoTime();
            String line;
            int countFileReader = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String words[] = line.split("\\s+");
                countFileReader += words.length;

            }
            System.out.println("FileReader Word Count "+countFileReader);
            long endTime = System.nanoTime();
            arr[0]=endTime-startTime;

            startTime = System.nanoTime();
            int countInputReader = 0;
            while ((line = inputReader.readLine()) != null) {
                String words[] = line.split("\\s+");
                countInputReader += words.length;

            }
            System.out.println("InputStreamReader Word Count "+ countInputReader);
            endTime = System.nanoTime();
            arr[1]=endTime-startTime;


        }catch (IOException e){
            System.out.println(e.getMessage());
        }



        return arr;
    }
}