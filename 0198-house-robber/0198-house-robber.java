class Solution {
    int[] memo;

    public int rob(int[] nums) {
        // Initialize memo array with -1 (meaning "not calculated yet")
        memo = new int[nums.length];
        java.util.Arrays.fill(memo, -1);
        
        // Start robbing from the last house (index n-1)
        return solve(nums, nums.length - 1);
    }

    private int solve(int[] nums, int i) {
        // BASE CASE: If we go past the first house, we get 0 money
        if (i < 0) return 0;
        
        // MEMO CHECK: If we already calculated this house, return it
        if (memo[i] != -1) return memo[i];
        
        // OPTION 1: Rob this house + the best from 2 houses ago
        int rob = nums[i] + solve(nums, i - 2);
        
        // OPTION 2: Skip this house and take the best from 1 house ago
        int skip = solve(nums, i - 1);
        
        // SAVE & RETURN: Store the best of both choices in memo
        memo[i] = Math.max(rob, skip);
        return memo[i];
    }
}
