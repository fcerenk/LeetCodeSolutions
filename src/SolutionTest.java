
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

    @Test
    public void test4() {
        Solution sol = new Solution();

        int[] arr = {1,2,3};
        int target = 5;

        int[] result = sol.twoSum2(arr, target);

        assertArrayEquals(new int[]{1,2}, result);

    }
    @Test
    public void test5(){
        int[] nums={4,2,8,5};
        Solution solution = new Solution();
        int target = 7;
        int[] indexArr = solution.twoSum2(nums,target);
        assertArrayEquals(new int[]{1,3}, indexArr);

    }
}
