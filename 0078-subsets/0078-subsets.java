class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        int high=1<<n;
        for(int i=0;i<high;i++)
        {
            List<Integer> curr=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){   
                    curr.add(nums[j]);
                }
                
            }
            result.add(curr);

        }
        return result;
    }
}

/* on line 10 we are using bit operation.. */
