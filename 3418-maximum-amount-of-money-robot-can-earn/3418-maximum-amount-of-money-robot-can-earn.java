import java.util.*;

class Solution {

    private Integer[][][] memo;

    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;

        // dp array
        memo = new Integer[m][n][3];

        return dfs(coins, 0, 0, 2); // start with 2 skips
    }

    private int dfs(int[][] coins, int i, int j, int k) {

        // out of bounds
        if (i >= coins.length || j >= coins[0].length) {
            return Integer.MIN_VALUE;
        }

        // reached last cell
        if (i == coins.length - 1 && j == coins[0].length - 1) {
            if (coins[i][j] < 0 && k > 0) return 0;
            return coins[i][j];
        }

        // already computed
        if (memo[i][j][k] != null) return memo[i][j][k];

        int val = coins[i][j];

        // move right and down
        int right = dfs(coins, i, j + 1, k);
        int down = dfs(coins, i + 1, j, k);

        // take current value
        int take = val + Math.max(right, down);

        // skip negative value if possible
        int skip = Integer.MIN_VALUE;
        if (val < 0 && k > 0) {
            int r = dfs(coins, i, j + 1, k - 1);
            int d = dfs(coins, i + 1, j, k - 1);
            skip = Math.max(r, d);
        }

        // store result
        return memo[i][j][k] = Math.max(take, skip);
    }
}