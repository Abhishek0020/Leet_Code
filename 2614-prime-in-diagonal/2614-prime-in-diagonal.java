class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // primary diagonal element
            int primary = nums[i][i];
            if (isPrime(primary)) {
                max = Math.max(max, primary);
            }

            // secondary diagonal element
            int secondary = nums[i][nums.length - 1 - i];
            if (isPrime(secondary)) {
                max = Math.max(max, secondary);
            }
        }

        return max;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
