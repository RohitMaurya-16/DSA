class Solution {
    public List<Integer> findPeaks(int[]  nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1])
            {
             list.add(i);
            }
        }
return list;
    }
}

