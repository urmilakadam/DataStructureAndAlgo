package BackTracking;

public class MazeWithObstacles {

    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        int countPath = countPath(board, 0, 0);
        System.out.println(countPath);


        printWays("", board, 0, 0);

    }


    static int countPath(boolean[][] board, int r, int c){
        if(r == board.length-1 || c == board[0].length-1)
            return 1;

        if(board[r][c] == false)
            return 0;


        int w1 = countPath(board, r+1, c);
        int w2 = countPath(board, r, c+1);

        return w1+w2;
    }

    static void printWays(String path, boolean[][] board, int r, int c){
        if(r == board.length-1 && c == board[0].length-1){
            System.out.println(path);
            return;
        }


        if(!board[r][c])
            return;

        if(r < board.length-1)
            printWays(path+"R", board, r+1, c);
        if(c < board[0].length-1)
            printWays(path+"D", board, r, c+1);

    }
}
