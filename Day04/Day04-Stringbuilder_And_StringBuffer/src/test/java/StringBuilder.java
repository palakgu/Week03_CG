import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuffer.concatenate.Concatinate_String;
import stringbuilder.remove_duplicate.Remove_Duplicate;
import stringbuilder.reverse_string.Reverse_String;

public class StringBuilder {
    @Test
    void duplicate(){
      String str = "palk";
        Assertions.assertEquals(Remove_Duplicate.removeDuplicate("palak"), str);
    }
        @Test
        void rev(){
            String str = "palak";
            Assertions.assertEquals(Reverse_String.reverse("kalap") , str);
        }

    }

