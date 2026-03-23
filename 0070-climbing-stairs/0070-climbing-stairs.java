class Solution {
    public int climbStairs(int n) {
        // if (n <= 2) return n;

        // int first = 1;  // Ways to reach step 1
        // int second = 2; // Ways to reach step 2

        // for (int i = 3; i <= n; i++) {
        //     int current = first + second;
        //     first = second; // Move 'first' pointer forward
        //     second = current; // Move 'second' pointer forward
        // }

        // return second;

        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
         arr[i]=arr[i-1]+arr[i-2];

        }
        return arr[n];
    }
}
