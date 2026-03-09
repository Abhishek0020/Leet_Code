import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> res = new ArrayList<>();

        int n = nums1.length;
        int m = nums2.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(nums1[i] == nums2[j] && !res.contains(nums1[i])){
                    res.add(nums1[i]);
                }

            }
        }

        int[] result = new int[res.size()];

        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }

        return result;
    }
}