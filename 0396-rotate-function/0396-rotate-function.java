class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        long f = 0;

        // 1. Calculate the total sum of array and the first F(0)
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            f += (long) i * nums[i];
        }

        long max = f;

        // 2. Use the shortcut formula to find other F(k) values
        for (int i = n - 1; i > 0; i--) {
            f = f + totalSum - (long) n * nums[i];
            if (f > max) max = f;
        }

        return (int) max;
    }
}
