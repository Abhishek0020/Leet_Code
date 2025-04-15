class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        while (true) {
            if (s.length() != t.length())
                return false;
            else if (s.length() == 0 && t.length() == 0)
                return true;

            char ch = s.charAt(0);
            s = s.replace(ch + "", "");
            t = t.replace(ch + "", "");
        }
    }
}
