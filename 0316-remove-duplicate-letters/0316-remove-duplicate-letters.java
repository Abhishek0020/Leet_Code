class Solution {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.length() == 0) return "";

        String result = "";

        while (!s.isEmpty()) {
            char minChar = 'z' + 1;
            int pos = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch < minChar) {
                    minChar = ch;
                    pos = i;
                }

                // If this character is the last occurrence, break early
                if (s.indexOf(ch, i + 1) == -1) break;
            }

            result += minChar;
            String remaining = s.substring(pos + 1).replaceAll(Character.toString(minChar), "");
            s = remaining;
        }

        return result;
    }
}
