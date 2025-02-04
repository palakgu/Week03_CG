import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import filereader.ReadFileLineByLine;
import filereader.Count;

public class filereader {
    @Test
    void file(){
        String s= "my name palak , i have been selected in Capgemini . and currently pursuing training i  Capgemini lab .";
        Assertions.assertEquals(ReadFileLineByLine.readFile("C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt").trim(),s);
    }
    @Test
    void count(){
        int count = 2;
        Assertions.assertEquals(Count.countWordOccurrences("C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt","Capgemini"), count);
    }
}
