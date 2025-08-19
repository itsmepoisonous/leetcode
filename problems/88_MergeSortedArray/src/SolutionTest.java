import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testMergeCase1() {
        Solution sol = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    public void testMergeCase2() {
        Solution sol = new Solution();
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testMergeCase3() {
        Solution sol = new Solution();
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testMergeCase4() {
        Solution sol = new Solution();
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1,2}, nums1);
    }
}
