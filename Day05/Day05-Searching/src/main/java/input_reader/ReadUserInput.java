package input_reader;

import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt";
        System.out.println(readAndWriteToFile(System.in,fileName));
    }
    public static String readAndWriteToFile(InputStream inputStream,String fileName) {
        StringBuilder sb=new StringBuilder();
        try (
                InputStreamReader streamReader=new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(streamReader);
                FileWriter fileWriter=new FileWriter(fileName);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while ((line = reader.readLine()) != null) {
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                sb.append(line).append("\n");
                writer.write(line);
                writer.newLine();
            }

            System.out.println("User input has been saved to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        return sb.toString();
    }

}
