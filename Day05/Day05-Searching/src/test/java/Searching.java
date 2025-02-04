import Lenior_search.First_Negative;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Searching {
    @Test
    void firstNegative(){
        int n = 2;
        int array[] ={2,3,-7,4,6};
        Assertions.assertEquals(First_Negative.negativeIndex(array),n);
    }
}
