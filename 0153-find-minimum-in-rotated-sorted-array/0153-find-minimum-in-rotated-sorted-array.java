class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        // int min=nums[0];
        // for(int i=1;i<n;i++)
        // {
        //     if(nums[i]<min)min=nums[i];
        // }
        // return min;
  // Above solution will have O(n) time complexity i need to achive O(logN) complextiy...
        int low=0;
        int high=n-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high])low=mid+1;
            else high=mid;
        }
        return nums[low];
    }
}