class Solution {
    public int rotatedDigits(int n) {
        int count=0;
     for(int i=0;i<=n;i++)
     {
        if(isGood(i))
        {
            count++;
        }

     }
   return count;
}

public boolean isGood(int i)
{
   
    boolean changed=false;
    while(i>0)
    {
        int k=i%10;
        if(k==3 ||k==4 || k==7)   return false;
         if(k==2 ||k==5 || k==6 ||k==9) changed=true;
        i=i/10;
    }
    return changed;
}
}