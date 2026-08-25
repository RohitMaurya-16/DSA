class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list= new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            int num=1;
            ArrayList<Integer> l= new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
             l.add(num);
             num=num*(i-j)/(j+1);
            }
            list.add(l);
        }
        return list;
    }
}