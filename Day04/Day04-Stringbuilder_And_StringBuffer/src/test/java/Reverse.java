import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilder.reverse_string.Reverse_String;


public class Reverse {
    @Test
    void rev(){
        String str = "palak";
        Assertions.assertEquals(Reverse_String.reverse("kalap") , str);
    }
}
