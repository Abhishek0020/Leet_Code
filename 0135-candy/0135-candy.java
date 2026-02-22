import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        // Initialize an array to store the number of candies for each child, all start with 1
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // First pass: Traverse from left to right to satisfy the left neighbor condition
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Second pass: Traverse from right to left to satisfy the right neighbor condition
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                // Take the maximum to satisfy both left and right conditions
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate the total number of candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
