class Solution {
    public int longestConsecutive(int[] nums) {
     Arrays.sort(nums);

     if(nums.length==0) return 0;
     int max=1;
     int curr=1;
     for(int i=0;i<nums.length-1;i++)
     {
        if(nums[i]!=nums[i+1])
        {
            if(nums[i]+1==nums[i+1])
            {
                curr++;
            }
            else
            {
                max=Math.max(curr,max);
                curr=1;
            }
        }
     }
     return Math.max(curr,max);
    }
}