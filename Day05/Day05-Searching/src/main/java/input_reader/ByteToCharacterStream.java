package input_reader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ByteToCharacterStream {

    public static void main(String[] args) {
        String fileName =  "C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt"; // Change to your file path
        String fileContent = readAndReturnFileContent(fileName);
        System.out.println(fileContent);
    }

    public static String readAndReturnFileContent(String fileName) {
        StringBuilder content = new StringBuilder();

        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}
