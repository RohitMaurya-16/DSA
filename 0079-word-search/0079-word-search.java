class Solution {
    public boolean exist(char[][] board, String word) {
        
        char arr[]=word.toCharArray();

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(arr[0]==board[i][j] && exist(board,i,j,arr,0))
                {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean exist(char[][] board, int i, int j, char[] arr, int index)
    {
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='#' || board[i][j]!=arr[index]) return false;
        
        if(index==arr.length-1)return true;
        char ch=board[i][j];
        board[i][j]='#';

        boolean res= exist(board, i+1, j, arr,index+1) ||
        exist(board, i-1, j, arr,index+1)||
        exist(board, i, j+1, arr,index+1)||
        exist(board, i, j-1, arr,index+1);

        board[i][j]=ch;

        return res;

    }
}