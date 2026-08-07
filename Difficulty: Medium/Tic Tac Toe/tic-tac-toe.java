class Solution {

    // All winning combinations
    static int[][] win = {
        {0,1,2}, {3,4,5}, {6,7,8},
        {0,3,6}, {1,4,7}, {2,5,8},
        {0,4,8}, {2,4,6}
    };

    public boolean isValid(char[] board) {

        int xCount = 0;
        int oCount = 0;

        // Count X and O
        for (int i = 0; i < 9; i++) {
            if (board[i] == 'X')
                xCount++;
            else if (board[i] == 'O')
                oCount++;
        }

        int cx = tick(board, 'X');
        int co = tick(board, 'O');

        // X always starts, so X must have exactly one extra move
        if (xCount != oCount + 1)
            return false;

        // Only O wins
        if (cx == 0 && co == 1)
            return true;

        // Only X wins
        if (co == 0 && cx == 1)
            return true;

        // Nobody wins
        if (cx == 0 && co == 0)
            return true;

        return false;
    }

    public int tick(char[] board, char p) {

        int count = 0;

        for (int i = 0; i < 8; i++) {

            if (board[win[i][0]] == p &&
                board[win[i][1]] == p &&
                board[win[i][2]] == p) {

                count++;
            }
        }

        return count;
    }
}