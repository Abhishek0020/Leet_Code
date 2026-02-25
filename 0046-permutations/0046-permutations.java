import java.util.*;

class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {

        // base case
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int num : nums) {

            // skip if already used
            if (temp.contains(num)) continue;

            temp.add(num);           // choose
            backtrack(result, temp, nums);  // explore
            temp.remove(temp.size() - 1);   // backtrack
        }
    }
}