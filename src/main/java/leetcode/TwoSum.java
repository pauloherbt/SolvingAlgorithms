package leetcode;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if(numbers.containsKey(target-rest))
                return new int[]{numbers.get(rest),i};
            numbers.put(rest, i);
        }
        return new int[0];
    }
}
