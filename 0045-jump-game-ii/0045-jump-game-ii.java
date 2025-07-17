class Solution {
    public int jump(int[] nums) {
       int jump=0;
       int currEnd=0;
       int possibleMax=0;
       for(int i=0;i<nums.length-1;i++){
        possibleMax=Math.max(possibleMax,i+nums[i]);
        if(i==currEnd){
            jump++;
            currEnd=possibleMax;
        }
       }
       return jump;
    }
}