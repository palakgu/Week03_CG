import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuffer.concatenate.Concatinate_String;
import stringbuffer.time_compare.Time_Compare;

public class StringBuffer {
    @Test
    void conc(){
        String str = "Palak is Lucky ";
        String[] s = new String[]{"Palak","is","Lucky"};
        Assertions.assertEquals(Concatinate_String.concatinateString(s), str);
    }
    @Test
    void compare(){
        long arr[] = Time_Compare.compare("palak");
        assert(arr[0]>arr[1]);

    }
}
