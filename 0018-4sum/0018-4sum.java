import java.util.*;

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);   // sort first

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicate j

                for (int k = j + 1; k < n - 1; k++) {

                    if (k > j + 1 && nums[k] == nums[k - 1]) continue; // skip duplicate k

                    for (int l = k + 1; l < n; l++) {

                        if (l > k + 1 && nums[l] == nums[l - 1]) continue; // skip duplicate l

                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                        if (sum == target) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }

        return result;
    }
}