public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n !=0){
            if(((n%10) & 1) == 1)
            count += 1;
            n>>>=1;
        }
        return count;
        
        
    }
}