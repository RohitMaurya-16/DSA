class Solution {
    public int jump(int[] nums) {
        
        int n=nums.length;
        int maxReach=0;
        int currEnd=0;
        int jumps=0;
        if(n<=1) return 0;

        for(int i=0;i<n;i++)
        {
          maxReach=Math.max(maxReach,i+nums[i]);

          if(currEnd==i)
          {
            jumps++;
            currEnd=maxReach;
    

          if(currEnd>=n-1) break;
          }
  }
  return jumps;  
}
}