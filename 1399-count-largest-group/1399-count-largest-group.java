import java.util.*;

public class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> groupSizes = new HashMap<>();
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int digitSum = getDigitSum(i);
            groupSizes.put(digitSum, groupSizes.getOrDefault(digitSum, 0) + 1);
            maxSize = Math.max(maxSize, groupSizes.get(digitSum));
        }

        int count = 0;
        for (int size : groupSizes.values()) {
            if (size == maxSize) count++;
        }

        return count;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
