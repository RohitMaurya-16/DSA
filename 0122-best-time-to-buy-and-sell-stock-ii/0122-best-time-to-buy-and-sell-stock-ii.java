class Solution {
    public int maxProfit(int[] arr) {
        int a=arr.length;
        int buy=0;
        int sell=0;
        int min=arr[0];
        int profit=0;
        
        for(int i=0;i<a-1;i++)
        {
          buy=i;
          sell=i+1;

          if(arr[sell]>arr[buy])
          {
            profit+=arr[sell]-arr[buy];
          }
        }

      return profit;


        // for(int i=0;i<a;i++){
        //     if(min>arr[i]){
        //         min=arr[i];
        //     }
        //     else if(arr[i]-min>profit){
        //         profit=arr[i]-min;
        //     }
        // }

        // if(profit>0){
        //     return profit;
        // }
        // else
        // {
        //     return 0;
        // }
    }
}