import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        // Return empty list if inputs are invalid
        if (s == null || words == null || words.length == 0) {
            return new ArrayList<>();
        }

        int sLen = s.length();
        int numWords = words.length;
        int wordLen = words[0].length();
        int totalLen = numWords * wordLen;
        List<Integer> result = new ArrayList<>();

        // Store the frequency of each word in the 'words' array
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        // Iterate through all possible starting offsets (0 to wordLen-1)
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int count = 0; // Number of words found in the current window
            Map<String, Integer> wordsFound = new HashMap<>();

            // Slide the window by wordLen increments
            for (int right = i; right + wordLen <= sLen; right += wordLen) {
                String currentWord = s.substring(right, right + wordLen);

                // Case 1: The current word is not in the original 'words' list
                if (!wordCount.containsKey(currentWord)) {
                    // Reset the window: move left to right, clear map, reset count
                    wordsFound.clear();
                    count = 0;
                    left = right + wordLen;
                } else {
                    // Case 2: The current word is valid
                    wordsFound.merge(currentWord, 1, Integer::sum);
                    count++;

                    // If the frequency of the current word exceeds the required count, shrink the window from the left
                    while (wordsFound.get(currentWord) > wordCount.get(currentWord)) {
                        String leftWord = s.substring(left, left + wordLen);
                        wordsFound.merge(leftWord, -1, Integer::sum);
                        count--;
                        left += wordLen;
                    }

                    // Case 3: A valid concatenation is found
                    // The window size (right + wordLen - left) equals the total length
                    if (count == numWords) {
                        result.add(left);
                        // Move the window to the right by one word length to look for the next match
                        String leftWord = s.substring(left, left + wordLen);
                        wordsFound.merge(leftWord, -1, Integer::sum);
                        count--;
                        left += wordLen;
                    }
                }
            }
        }

        return result;
    }
}
