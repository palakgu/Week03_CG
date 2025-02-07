import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import search_comparision.SearchComparison;
import sorting_comparison.SortingComparison;

public class Comparison {
    @Test
    void searchingComparison(){
        int sizes[] = {1000,10000 ,100000};

        for(int size :sizes){
           double ans[] = SearchComparison.compare(size);
            Assertions.assertEquals(ans[0]>ans[1],true);

        }
    }
    @Test
    void sortingComparison(){
        int sizes[] ={1000 , 10000 };
        for(int size : sizes){
            double ans[] = SortingComparison.compare(size);
            Assertions.assertTrue(ans[0]>ans[1]);
        }

    }
}
