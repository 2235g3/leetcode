class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 1;
        int k = 1;
        for (int i = (m + n - 1); i >= 0; i--) {
            if (n-k < 0) {
                nums1[i] = nums1[m-j++];
            } else if (m-j < 0) {
                nums1[i] = nums2[n-k++];
            } else if (nums1[Math.max(0, (m-j))] < nums2[Math.max(0, (n-k))]) {
                nums1[i] = nums2[n-k++];
            } else {
                nums1[i] = nums1[m-j++];
            }
        }
    }
}
