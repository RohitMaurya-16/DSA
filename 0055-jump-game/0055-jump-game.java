class Solution {
    public boolean canJump(int[] nums) {
        int reachable=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>reachable) return false;
            reachable=Math.max(reachable,i+nums[i]);
        }
        return true;
        
    //     int n=nums.length;
    //     boolean dp[]=new boolean[n];
    //     Arrays.fill(dp,false);
    //     dp[n-1]=true;

    //     for(int i=n-2;i>=0;i--)
    //     {
    //         int far=Math.min(i+nums[i],n-1);

    //         for(int j=i+1;j<=far;j++)
    //         {
    //             if(dp[j]==true)
    //             {
    //                 dp[i]=true;
    //             }
    //         }
    //     }
    //   return dp[0];

    }
}