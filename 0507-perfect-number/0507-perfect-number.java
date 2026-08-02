class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        boolean bool=true;
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;

                if(i!=num/i)
                {
                    sum=sum+num/i;
                }
            }
        }
        sum=sum-num;
       if(sum!=num)
       {
        bool=false;
       }
       return bool;
    }
}