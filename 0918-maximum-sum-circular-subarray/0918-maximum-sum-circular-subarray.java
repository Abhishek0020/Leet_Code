class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int currMax = 0;
        int minSum = nums[0];
        int currMin = 0;
        
        for (int num : nums) {
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);

            totalSum += num;
        }
        
        // Case 1: Non-circular subarray maximum (normal Kadane's result)
        // Case 2: Circular subarray maximum = totalSum - minSum
        // But if all numbers are negative, then totalSum == minSum
        if (maxSum < 0) {
            return maxSum; // all elements are negative
        }
        
        return Math.max(maxSum, totalSum - minSum);
    }
}
