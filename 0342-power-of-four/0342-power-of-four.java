class Solution {
    public boolean isPowerOfFour(int n) {
        // double k= (Math.log(n) / Math.log(4));
        // if(Math.pow(n,k)==(double)n)return true;
        // else return false;
        
        if(n<=0)return false;
        if(n==1)return true;
        if(n%4!=0)return false;
        return  isPowerOfFour(n/4);
        
    }
}