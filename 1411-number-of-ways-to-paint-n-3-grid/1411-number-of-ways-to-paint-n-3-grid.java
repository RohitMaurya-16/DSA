class Solution {
    public int numOfWays(int n) {
        int mod=1_000_000_007;
        long A=6;
        long B=6;
        for(int i=1;i<n;i++)
        {
            long nA=((A*3+B*2)%mod);
            long nB=((A*2+B*2)%mod);
            A=nA;
            B=nB;
        }

        return (int)((A+B)%mod);
    }
}