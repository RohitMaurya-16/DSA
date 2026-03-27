// User function Template for Java

class Solution {
    int arr[]=new int[45+1];
    int countStrings(int n) {
        arr[0]=0;
        arr[1]=2;
        arr[2]=3;
        
        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
        
    }
}