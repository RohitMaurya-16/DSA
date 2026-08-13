class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
       
         int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
         int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                int count=0;

                for(int k=0;k<8;k++)
                {
                    int ni=i+dr[k];
                    int nj=j+dc[k];

                    if(ni>=0 && ni<m && nj>=0 && nj<n)
                    {
                        if(board[ni][nj]==1 || board[ni][nj]==2) count++;
                    } 
                }
                 if(board[i][j]==1)
                 {
                    if(count<2 ||count>3)
                    {
                        board[i][j]=2;
                    }
                 }
                 else if(board[i][j]==0)
                 {
                    if(count==3)
                    {
                        board[i][j]=3;
                    }
                 }

            }
         }

         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==2) board[i][j]=0;
                else if(board[i][j]==3) board[i][j]=1;
            }
         }
         return;
    }
}