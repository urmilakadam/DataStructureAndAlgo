package BackTracking;

public class WordSearch {

    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {

        if(word.isEmpty())
            return true;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(isWordPresent(board, word, i, j))
                        return true;
                }
            }
        }

        return false;
    }

    boolean isWordPresent(char[][] board, String word, int r, int c){
        if(word.isEmpty()) return true;

        if(board[r][c] == word.charAt(0)){
            isWordPresent(board, word.substring(1), r+1, c);
        }

        return false;
    }
}
