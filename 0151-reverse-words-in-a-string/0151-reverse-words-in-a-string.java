class Solution {
    public String reverseWords(String s) {
        // Trim the string to remove leading/trailing spaces
        s = s.trim();

        // Split the string by spaces (\\s+ means multiple spaces)
        String[] words = s.split("\\s+");

        // Use StringBuilder to reverse and join words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0)
             sb.append(" ");
        }

        return sb.toString();
    }
}
