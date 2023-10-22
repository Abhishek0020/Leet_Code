class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0, ind=-1;
        int [] cp = new int[nums.length];
      for (int i=0;i<nums.length; i++){
          cp[i] = nums[i];
      }
        
   
        
      for(int i=0;i<nums.length;i++ ){
        if(val !=cp[i]){
            nums[++ind]=cp[i];
        
            count++;
        }
      }
        return count;
        
    }
}