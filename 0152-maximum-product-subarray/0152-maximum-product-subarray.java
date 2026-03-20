class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max_prod=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int prod=1;
                for(int k=i;k<=j;k++){
                    prod *=nums[k];
                }
                 max_prod=Math.max(max_prod,prod);
            }
           
        }
        return max_prod;
    }
}