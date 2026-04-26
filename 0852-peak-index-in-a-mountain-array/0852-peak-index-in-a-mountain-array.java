class Solution {
    public int peakIndexInMountainArray(int[] nums) {
         int n=nums.length;
        
        if(n==2 && nums[0]>nums[1])
        {
            return 0;
        }
        if(n==2 && nums[0]<nums[1])
        {
            return 1;
        }
        
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
            return i;
        }
        return 0;
    }
}