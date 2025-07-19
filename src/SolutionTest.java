
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {
    @Test
    public void test1() {
        Solution sol = new Solution();
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};
        int[] result = sol.twoSum(arr, target);

        assertArrayEquals(expected, result);
    }


    @Test
    public void test2() {
        Solution sol = new Solution();
        int[] arr = {3,2,4};
        int target = 6;
        int[] expected = {1,2};
        int[] result = sol.twoSum(arr, target);
        assertArrayEquals(expected, result);
    }
    @Test
    public void test3() {
        Solution sol = new Solution();
        int[] arr = {3,3};
        int target = 6;
        int[] expected = {0,1};
        int[] result = sol.twoSum(arr, target);
        assertArrayEquals(expected, result);
    }
}
