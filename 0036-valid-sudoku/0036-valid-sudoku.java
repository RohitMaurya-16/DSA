// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         int arr[]=new int[10];
//         boolean bool[]=new boolean[10];
//         Arrays.fill(bool,true);
//         boolean bool1[]=new boolean[10];
//         Arrays.fill(bool1,true);
//         for(int i=0;i<9;i++)
//         {
//             Arrays.fill(arr,0);
//             for(int j=0;j<9;j++)
//             {
//               if(board[i][j]!= '.')
//                 {
//               int l=board[i][j]-'0';
//               arr[l]=arr[l]+1;
//                 }
//             }

//             for(int k=1;k<=9;k++ )
//             {
//                 if(arr[k]>1) bool[k]=false;
//             }
//         }


//         for(int i=0;i<9;i++)
//         {
//             Arrays.fill(arr,0);
//             for(int j=0;j<9;j++)
//             {
//                 if(board[j][i]!= '.')
//                 {
//               int l=board[j][i]-'0';
//               arr[l]=arr[l]+1;
//                 }
//             }

//             for(int k=1;k<=9;k++ )
//             {
//                 if(arr[k]>1) bool1[k]=false;
//             }
//         }
//         int count=1;
//         for(int i=1;i<=9;i++)
//         {
//           if(bool[i]==true && bool1[i]==true)
//           {
//             count++;
//           }
//         }
//        if(count==9)
//        {
//         return true;
//        }

//        return false;
//     }
// }

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int arr[] = new int[10];
        boolean bool[] = new boolean[10];
        boolean bool1[] = new boolean[10];
        boolean bool2[] = new boolean[10];

        for (int i = 0; i < 9; i++) {
            Arrays.fill(arr, 0);
            Arrays.fill(bool, true);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int l = board[i][j] - '0';
                    arr[l] = arr[l] + 1;
                }
            }
            for (int k = 1; k <= 9; k++) {
                if (arr[k] > 1) bool[k] = false;
            }
            for (int k = 1; k <= 9; k++) {
                if (!bool[k]) return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            Arrays.fill(arr, 0);
            Arrays.fill(bool1, true);
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int l = board[j][i] - '0';
                    arr[l] = arr[l] + 1;
                }
            }
            for (int k = 1; k <= 9; k++) {
                if (arr[k] > 1) bool1[k] = false;
            }
            for (int k = 1; k <= 9; k++) {
                if (!bool1[k]) return false;
            }
        }

        for (int block = 0; block < 9; block++) {
            Arrays.fill(arr, 0);
            Arrays.fill(bool2, true);
            int rowOffset = (block / 3) * 3;
            int colOffset = (block % 3) * 3;
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[rowOffset + i][colOffset + j] != '.') {
                        int l = board[rowOffset + i][colOffset + j] - '0';
                        arr[l] = arr[l] + 1;
                    }
                }
            }
            for (int k = 1; k <= 9; k++) {
                if (arr[k] > 1) bool2[k] = false;
            }
            for (int k = 1; k <= 9; k++) {
                if (!bool2[k]) return false;
            }
        }

        return true;
    }
}
