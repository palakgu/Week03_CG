package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt";
        String targetWord = "Capgemini";  // The word you want to search for

        int count = countWordOccurrences(filePath, targetWord);
        System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");

    }
    public static int countWordOccurrences(String filePath, String targetWord) {
        int count = 0;

        try {
            // Create FileReader and wrap it in BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words (using regex to handle multiple spaces)
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Check if the word matches the target word (case-insensitive comparison)
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        return count;
    }
}