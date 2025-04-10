class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
         return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                if (Character.isLetter(ch)) {
                    char lowerCh = Character.toLowerCase(ch);
                    if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                        hasVowel = true;
                    } else {
                        hasConsonant = true;
                    }
                }
            } else {
                // If not letter or digit, it's invalid
                return false;
            }
        }

        return hasVowel && hasConsonant;
    }
}
