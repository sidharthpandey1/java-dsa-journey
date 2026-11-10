
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int i = 0, j = 0, idx = 0;

        int[] ans = new int[n1 + n2];

        while (i < n1 && j < n2) {

            if (nums1[i] < nums2[j]) {
                ans[idx++] = nums1[i++];
            }
            else {
                ans[idx++] = nums2[j++];
            }
        }

        while (i < n1) {
            ans[idx++] = nums1[i++];
        }

        while (j < n2) {
            ans[idx++] = nums2[j++];
        }

        int n = ans.length;

        if (n % 2 == 0) {
            return ((double)ans[n/2 - 1] + ans[n/2]) / 2;
        }

        return ans[n/2];
    }
}
