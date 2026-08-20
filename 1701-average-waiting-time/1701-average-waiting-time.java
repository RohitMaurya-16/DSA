class Solution {
    public double averageWaitingTime(int[][] customers) {
        ArrayList<Integer> list= new ArrayList<>();
        int curr[]=customers[0];  // [1,2]
        int sum=curr[0]+curr[1];  //3
        list.add(sum-curr[0]);  //2
        for(int i=1;i<customers.length;i++)
        {
           curr=customers[i];   //[2,5] 
            if (sum < curr[0]) {
               sum = curr[0];
           }
           sum+=curr[1];       // 5+3
           list.add(sum-curr[0]);     //8-2         
        }

          long avg=0;
          for(int i:list)
          {
            avg+=i;
          }

          return (double)avg/list.size();
    }
}