import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TwoSumIITest {
    private TwoSum2 twoSum2;
    @BeforeEach
    public void setUp(){
         twoSum2 = new TwoSum2();
    }

    @Test
    public void test(){
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected,twoSum2.twoSum(arr,target));
    }

    @Test
    public void test2(){
        int[] arr = {2,3,4};
        int target =6;
        int[] expected={1,3};
        assertArrayEquals(expected,twoSum2.twoSum(arr,target));
    }

    @Test
    public void test3(){
        int[] arr ={-1,0};
        int target = -1;
        int[] expected = {1,2};
        assertArrayEquals(expected,twoSum2.twoSum(arr,target));
    }
}
