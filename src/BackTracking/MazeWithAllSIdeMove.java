package BackTracking;

public class MazeWithAllSIdeMove {

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        printWays("", board, 0, 0);
    }

    static void printWays(String path, boolean[][] board, int r, int c){
        if(r == board.length-1 && c == board[0].length-1){
            System.out.println(path);
            return;
        }

        if(board[r][c] == false)
            return;

        board[r][c] = false;
        if(r < board.length-1)
            printWays(path+"R", board, r+1, c);

        if(c < board[0].length-1)
            printWays(path+"D", board, r, c+1);

        if(r > 0)
            printWays(path+"U", board, r-1, c);
        if(c > 0)
            printWays(path+"L", board, r, c-1);

        board[r][c] = true;
    }
}
