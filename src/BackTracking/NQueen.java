package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    public static void main(String[] args) {
        List<List<String>> solveNQueens = solveNQueens(4);

        System.out.println(solveNQueens);
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] chars = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chars[i][j]= '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        nQPosition(chars, 0, result);
        return result;
    }

    static void nQPosition(char[][] board, int row, List<List<String>> result){

        if(row == board.length){
            result.add(arrayToList(board));
            return;
        }

        for(int i=0; i<board.length; i++){
            if(isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQPosition(board, row + 1, result);
                board[row][i] = '.';
            }
        }
    }

    static List<String> arrayToList(char[][] originalList) {
        List<String> list = new ArrayList<>();

        for (char[] innerList : originalList) {
            list.add(new String(innerList));
        }
        return list;
    }

    static boolean isSafe(char[][] board, int row, int col){

        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q')
                return false;
        }

        for(int i = row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q')
                return false;
        }

        for(int i = row-1, j=col+1; i>=0 && j <board.length; i--, j++){
            if(board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
