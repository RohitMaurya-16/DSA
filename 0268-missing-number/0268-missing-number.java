class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=nums[i];
            if(k==a)
            {
             a++;
            }
            else
            {
                return a;
            }
     
       }  
    return nums.length; }
}