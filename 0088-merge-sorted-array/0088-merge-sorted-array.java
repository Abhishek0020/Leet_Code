import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2, and merged position
        int i = m - 1;       // Last index of elements in nums1
        int j = n - 1;       // Last index of nums2
        int k = m + n - 1;   // Last index of merged array

        // Merge nums1 and nums2 from end to beginning
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If any elements remain in nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
