import java.util.Arrays;

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // Correctly slicing: prefix is 0 to i, suffix is i to n
            int[] subArray = Arrays.copyOfRange(nums, 0, i + 1);
            int[] subArray1 = Arrays.copyOfRange(nums, i, n);

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            // FIX 1: Use 'j' to check bounds, not 'i'
            for (int j = 0; j < subArray.length; j++) {
                max = Math.max(max, subArray[j]);
            }

            // FIX 2: Use 'j' to check bounds and access index subArray1[j]
            for (int j = 0; j < subArray1.length; j++) {
                min = Math.min(min, subArray1[j]);
            }

            int z = max - min;

            if (z <= k) return i;
        }
        return -1;
    }
}
