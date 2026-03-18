class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Step 1: check if valid pattern exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: find gcd of lengths
        int len = gcd(str1.length(), str2.length());

        // Step 3: return substring
        return str1.substring(0, len);
    }

    // helper method (outside main method)
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}