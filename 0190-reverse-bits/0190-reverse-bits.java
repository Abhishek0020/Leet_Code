public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            result <<= 1;          // Left shift result to make space for next bit
            result |= (n & 1);     // Add the least significant bit of n to result
            n >>= 1;               // Right shift n to move to the next bit
        }
        
        return result;
    }
}
