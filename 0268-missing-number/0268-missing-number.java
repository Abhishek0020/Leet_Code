class Solution {
  public int missingNumber(int[] nums) {
        int n = nums.length;  // Number of elements in the array

        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;  // Calculate actual sum of elements in the array
        }

        return expectedSum - actualSum; // The difference is the missing number
    }
}