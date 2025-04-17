import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restore(s, 0, 0, "", result);
        return result;
    }

    // Helper function: index = current position in s, dots = parts added so far
    private void restore(String s, int index, int dots, String current, List<String> result) {
        // If 4 parts are added and all characters are used, add to result
        if (dots == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1)); // remove trailing dot
            return;
        }

        // If more than 4 parts or out of bounds, stop
        if (dots > 4 || index >= s.length()) return;

        // Try parts of length 1 to 3
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);

            // Skip if part is invalid (e.g., "00", "256")
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255)
                continue;

            // Recurse with next part and add current to string with dot
            restore(s, index + len, dots + 1, current + part + ".", result);
        }
    }
}
