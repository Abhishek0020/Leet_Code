
import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {

        int[] distinct=Arrays.stream(nums).distinct().sorted().toArray();
        for(int i=0;i<distinct.length;i++){
            nums[i]=distinct[i];
        }
        return distinct.length;
    }
}