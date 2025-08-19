import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testExample1() {
        Solution sol = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = sol.removeElement(nums, val);

        assertEquals(2, k);  // expected length
        int[] expected = {2, 2};
        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void testExample2() {
        Solution sol = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = sol.removeElement(nums, val);

        assertEquals(5, k);  // expected length
        int[] expected = {0,1,3,0,4};
        // order can vary, so check set membership
        for (int i = 0; i < k; i++) {
            assertTrue(contains(expected, nums[i]));
        }
    }

    @Test
    void testEmptyArray() {
        Solution sol = new Solution();
        int[] nums = {};
        int val = 1;

        int k = sol.removeElement(nums, val);

        assertEquals(0, k);
    }

    private boolean contains(int[] arr, int value) {
        for (int x : arr) {
            if (x == value) return true;
        }
        return false;
    }
}
