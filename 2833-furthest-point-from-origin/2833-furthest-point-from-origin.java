class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        // Hint: see answer will total occurance of '_'+Math.abs(R occurance-L occurance);
    int L=0,R=0,B=0;
        for(char ch:moves.toCharArray())
        {
            if(ch=='L') L++;
            else if(ch=='R') R++;
            else B++;
        }
        return Math.abs(R-L)+B;
    }
}