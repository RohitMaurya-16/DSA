class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
       // int max=0;
        while(low<high)
        {
            mid=low+(high-low)/2;
           
            if(nums[mid]>nums[mid+1])  // i am in decreasing part of the array max peak should be in left
            {
            high=mid;   //  why not high=mid-1 bcz may be mid is a answer and its is p peak element.
          
            }
           else  //  i am in increasing part of array answer should be in right side
            {
                low=mid+1;   // mid+1>mid thats why low=mid+1 as a start of new array
            }
            // at the end mid and start element will be same
        }
        return low;
    }
}