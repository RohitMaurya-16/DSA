class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        

        for(int c:candies)
        {
            max=Math.max(c,max);
        }
        for(int c:candies)
        {
            int k=c+extraCandies;

            if(k>=max)
            {
                list.add(true);
                
            }
            else
            {
                list.add(false);
            
            }
        }
        return list;
    }
}