class Solution {
    public int longestPalindrome(String s) {
        //Get every character frequency.
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        /* Get how many characters have an odd frequency.*/
        /* because of the exception that
one character may have odd frequency, we will set oddCount to -1 */
        int oddCount = -1;
        for (int v: count) {
            if (v % 2 != 0) oddCount++;
        }
        /* Return your the number of all characters -
the number of characters that appear an odd number of times. */
        // if there is no letter with odd frequency return full length
        return (oddCount > 0) ? s.length() - oddCount: s.length();
    }
}