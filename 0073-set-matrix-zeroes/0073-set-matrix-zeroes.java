// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m=matrix.length;
//         int n=matrix[0].length;
//         int arr[][]=new int[m][n];

//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(matrix[i][j]==0)
//                 {
//                  arr[i][j]=1;
//                 }
//             }
//         }

//          for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(arr[i][j]==1)
//                 {
//                   for(int k=0;k<n;k++ )
//                   {
//                     matrix[i][k]=0;
//                   }

//                   for(int k=0;k<m;k++)
//                   {
//                     matrix[k][j]=0;
//                   }
//                 }
//             }
//         }
//         return ;
//     }
// }


class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Step 1: Find all original zeroes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Set corresponding rows and columns to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}