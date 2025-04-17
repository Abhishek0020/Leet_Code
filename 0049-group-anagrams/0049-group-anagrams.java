import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store groups of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert to char array, sort it, then convert back to string
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Use sorted string as key
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        // Return all values as a list of lists
        return new ArrayList<>(map.values());
    }
}
