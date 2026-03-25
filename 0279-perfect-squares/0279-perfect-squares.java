class Solution {
    public int numSquares(int n) {
        int DP[]=new int[n+1];
          Arrays.fill(DP, n); 
         DP[0]=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j*j<=i;j++)
            {
              DP[i] = Math.min(DP[i], DP[i - j*j] + 1);
            }
        }
         return DP[n];
    }
   
}





// Initial State: 
// DP array of size 13 (0 to 12)
// Filled with '12' (n), except DP[0] = 0
// DP = [0, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12]

// i = 1:
//   j=1 (1*1=1): DP[1] = min(12, DP[1-1]+1) -> min(12, 1) = 1
// i = 2:
//   j=1 (1*1=1): DP[2] = min(12, DP[2-1]+1) -> min(12, 2) = 2
// i = 3:
//   j=1 (1*1=1): DP[3] = min(12, DP[3-1]+1) -> min(12, 3) = 3
// i = 4:
//   j=1 (1*1=1): DP[4] = min(12, DP[4-1]+1) -> min(12, 4) = 4
//   j=2 (2*2=4): DP[4] = min(4, DP[4-4]+1)  -> min(4, 1) = 1  <-- (4 is a perfect square)

// ... skipping to i = 12 ...

// i = 12:
//   j=1 (1*1=1): DP[12] = min(12, DP[11]+1) -> DP[11] is 3 (9+1+1), so 3+1 = 4
//   j=2 (2*2=4): DP[12] = min(4, DP[12-4]+1) -> DP[8] is 2 (4+4), so 2+1 = 3
//   j=3 (3*3=9): DP[12] = min(3, DP[12-9]+1) -> DP[3] is 3 (1+1+1), so 3+1 = 4
// Final min for DP[12] is 3.

 // Result: 3
