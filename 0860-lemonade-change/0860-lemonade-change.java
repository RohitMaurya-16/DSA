class Solution {
    public boolean lemonadeChange(int[] bill) {
          int n=bill.length;

        int counterFive=0;
        int counterTens=0;
        for(int i=0;i<n;i++)
        {
          if(bill[i]==5)
          {
            counterFive++;
          }
          else if (bill[i] == 10)
           {
                if (counterFive == 0) return false;
                counterFive--;
                counterTens++;
            }
          else
          {
            if(counterTens>0 && counterFive>0)
            {
                counterTens--;
                counterFive--;
            }
            else if (counterFive >= 3)
             {
                    counterFive -= 3;
             }
             else
             {
                return false;
             }
        }                   
  
    }
     return true;
}
}