class Solution {
    public int[][] rotate(int[][] matrix) {
       int[][] arr = new int[matrix.length][matrix[0].length];
       // row length=matrix.length;  column length=matrix[0].length;
    int n1=matrix.length;
    // int n2=matrix[0].length;

    for(int i=0;i<n1;i++)
    {    int k=0;
        for(int j=n1-1;j>=0;j--)
        {
            arr[i][k]=matrix[j][i];
            k++;
        }
    }
    
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<n1;j++)
        {
            matrix[i][j]=arr[i][j];
        }
    }
  return matrix;
    }
}