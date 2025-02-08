import Recursivevsiterativefibonacci.RecursiveVsIterativeFibonacci;
import largefilereadingefficiency.LargeFileReadingEfficiency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Compare_Time {
    @Test
    void fileReaderVsInputStream(){
        int arr[]= LargeFileReadingEfficiency.compares();
//        arr[0]=FileReader Time;
//        arr[1]= InputStreamReader Time;
        Assertions.assertTrue(arr[0]>arr[1]);
    }
    @Test
    void recursiveVsIterative(){
        double arr[] = RecursiveVsIterativeFibonacci.compare();
        Assertions.assertTrue(arr[1]>arr[0]);
    }
}
