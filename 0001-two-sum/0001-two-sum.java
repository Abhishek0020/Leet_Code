public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};  // Return the indices of the two numbers
                }
            }
        }
        // Return an empty array if no solution is found (though the problem assumes there's always a solution)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
