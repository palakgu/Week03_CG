import Lenior_search.Find_Word;
import Lenior_search.First_Negative;
import binary_search.Find_Target;
import binary_search.FirstandLastOccurence;
import binary_search.Peak_Element;
import binary_search.Rotation_Point;
import chalange_problems.BinarySearch;
import chalange_problems.Lenior_Search;
import input_reader.ByteToCharacterStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Searching {
    @Test
    void firstNegative(){
        int n = 2;
        int array[] ={2,3,-7,4,6};
        Assertions.assertEquals(First_Negative.negativeIndex(array),n);
    }
    @Test
    void word(){
        String word = "Palak";
        String Array[] ={" my name is Palak", "my name is abhi"};
        Assertions.assertEquals(Find_Word.findSentences(Array,word),Array[0]);
    }
    @Test
    void check(){
        int array[] ={5,4,1,2,3};
        int n = 1;
        Assertions.assertEquals(Rotation_Point.IndexofSmallest(array),n);
    }
    @Test
    void peek(){
        int array[] = {2,3,4,5,6,1};
        int n = 6;
        Assertions.assertEquals(Peak_Element.findPeak(array),n);
    }
    @Test
    void target(){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;
        boolean flag = true;
        Assertions.assertEquals(Find_Target.searchMatrix(matrix , target), flag);
    }
    @Test
    void occurence(){
        int[] nums = {2, 4, 4, 4, 5, 5, 7, 9};
        int target = 4;
        int n =1;
        int m=3;
        Assertions.assertEquals(FirstandLastOccurence.findFirstOccurrence(nums ,target) ,n );
        Assertions.assertEquals(FirstandLastOccurence.findLastOccurrence(nums,target),m);
    }
    @Test
    void input(){
        String fileName =  "C:\\Users\\palak\\OneDrive\\Desktop\\New folder\\file1.txt";
        String str = "my name palak , i have been selected in Capgemini . and currently pursuing training i  Capgemini lab .";
        Assertions.assertEquals(ByteToCharacterStream.readAndReturnFileContent(fileName).trim(),str);
    }
@Test
    void Search(){
        int arr[] = {3, 4, -1, 1};
    int target = 4;
    int pos = 3;
    Assertions.assertEquals(BinarySearch.binarySearch(arr , target),pos);
}
@Test
    void search2(){
    int[] nums = {3, 4, -1, 1};
    int ans = 2;
    Assertions.assertEquals(Lenior_Search.firstMissingPositive(nums), ans);
}
}
