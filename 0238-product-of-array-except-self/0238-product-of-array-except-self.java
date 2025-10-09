class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        int[] ans=new int[n];
        Arrays.fill(ans,1);//initilize with 1
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    ans[i] *=nums[j];
                }
            }
        }
        return ans;    
    }
}