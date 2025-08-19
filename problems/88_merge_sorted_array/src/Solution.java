class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int j = 0, k = 0;
        for (int i = 0; i < m+n; i++) {
            if ((nums1.length == 0) || (nums2.length > 0  && k < n && nums1[j] > nums2[k]) || (j>=m)) {
                nums3[i] = nums2[k];
                k++;
            } else if (j < m) {
                nums3[i] = nums1[j];
                j++;
            }
        }
        for (int i = 0; i < nums3.length; i++)
            nums1[i] = nums3[i];
    }
}