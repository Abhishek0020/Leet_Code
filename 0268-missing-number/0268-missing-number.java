class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;

       int actsum=0;
       int expsum=n*(n+1)/2;

       for(int num:nums){
        actsum +=num;
       }
       return expsum-actsum;
    }
}