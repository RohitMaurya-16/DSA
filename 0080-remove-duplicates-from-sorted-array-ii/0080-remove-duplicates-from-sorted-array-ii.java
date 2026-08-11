class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int count=0;
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int idx=0;
         for(Map.Entry<Integer, Integer> pair : map.entrySet())
         {
            
            int allowedAmount=0;
            if(pair.getValue()>2)
            {
                count+=2;
                allowedAmount=2;
            }
            else
            {
                count+=pair.getValue();
                allowedAmount=pair.getValue();
            }
            for (int i = 0; i < allowedAmount; i++) {
                nums[idx] = pair.getKey();
                idx++;
            }
         }
         return count;
    }
}