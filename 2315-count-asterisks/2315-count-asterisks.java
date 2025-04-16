class Solution {
    public int countAsterisks(String s) {
        int uc = 0, lc = 0, sc = 0;
        int asteriskCount = 0;
        boolean insideBar = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '|') {
                insideBar = !insideBar;  // Toggle the inside-bar flag
            } else {
                if (ch >= 'A' && ch <= 'Z') {
                    uc++;
                } else if (ch >= 'a' && ch <= 'z') {
                    lc++;
                } else {
                    sc++;
                }

                if (ch == '*' && !insideBar) {
                    asteriskCount++;  // Only count if outside bars
                }
            }
        }

        // Optional: Print other character counts
        System.out.println("Uppercase Count: " + uc);
        System.out.println("Lowercase Count: " + lc);
        System.out.println("Special Character Count: " + sc);

        return asteriskCount;
    }
}
