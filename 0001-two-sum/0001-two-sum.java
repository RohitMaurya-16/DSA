import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        // store value -> index
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }

        // check for complement
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];

            if (map.containsKey(k) && map.get(k) != i) {
                return new int[]{i, map.get(k)};
            }
        }

        return new int[]{};
    }
}