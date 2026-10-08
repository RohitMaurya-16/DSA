class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        res=new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        
        cs(candidates, target, curr,0);

        return res;
    }

    private void cs(int nums[], int target, List<Integer> curr, int i)
    {
        if(target==0)
        {
            res.add(new ArrayList(curr));
            return;
        }

        if(target<0 || i>=nums.length)
        {
            return ;
        }

         curr.add(nums[i]);
        cs(nums, target-nums[i],curr,i);
        
        curr.remove(curr.size()-1);

        cs(nums,target, curr,i+1);
    }
}