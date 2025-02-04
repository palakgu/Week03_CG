import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilder.remove_duplicate.Remove_Duplicate;

public class Duplicate {
    @Test
    void duplicate(){
      String str = "palk";
        Assertions.assertEquals(Remove_Duplicate.removeDuplicate("palak"), str);
    }
}
