class Solution {

    // ✅ Correct distance function
    private int dist(int a, int b) {
        if (a == 26) return 0; // unused finger
        
        int x1 = a / 6, y1 = a % 6;
        int x2 = b / 6, y2 = b % 6;
        
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
    
    public int minimumDistance(String word) {
        int[][] dp = new int[27][27];
        
        // initialize
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 27; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        dp[26][26] = 0; // both fingers unused
        
        for (char c : word.toCharArray()) {
            int curr = c - 'A';
            int[][] newDp = new int[27][27];
            
            for (int i = 0; i < 27; i++) {
                for (int j = 0; j < 27; j++) {
                    newDp[i][j] = Integer.MAX_VALUE;
                }
            }
            
            for (int f1 = 0; f1 < 27; f1++) {
                for (int f2 = 0; f2 < 27; f2++) {
                    
                    if (dp[f1][f2] == Integer.MAX_VALUE) continue;
                    
                    // move finger1
                    int cost1 = dp[f1][f2] + dist(f1, curr);
                    newDp[curr][f2] = Math.min(newDp[curr][f2], cost1);
                    
                    // move finger2
                    int cost2 = dp[f1][f2] + dist(f2, curr);
                    newDp[f1][curr] = Math.min(newDp[f1][curr], cost2);
                }
            }
            
            dp = newDp;
        }
        
        int ans = Integer.MAX_VALUE;
        
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 27; j++) {
                ans = Math.min(ans, dp[i][j]);
            }
        }
        
        return ans;
    }
}



// This is done useing ai..