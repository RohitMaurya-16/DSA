class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[]=new int[matrix.length];

        for(int i=0;i<matrix.length;i++)
        {
            int arr1[]=matrix[i];
            int c=0;
            for(int j=0;j<arr1.length;j++)
            {
             if(arr1[j]==1)
             c++;
            }
            arr[i]=c;
        }
        return arr;
    }
}