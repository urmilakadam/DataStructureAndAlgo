package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maze {

    public static void main(String[] args) {
        int ways = countWays(3, 3);
        System.out.println(ways);
        List<String> path = getPaths("", 3, 3);
        System.out.println(path);

        printPath("", 3,3);
    }

    static int countWays(int row, int col){

        if(row == 1 || col == 1)
            return 1;

        int left = countWays(row-1, col);
        int right = countWays(row, col-1);

        return left + right;
    }


    static List<String> getPaths(String path, int row, int col){

        if(row == 1 && col == 1) {
            return Collections.singletonList(path);
        }
        List<String> list = new ArrayList<>();
        if(row-1 > 0)
            list.addAll(getPaths(path+"D", row-1, col));
        if(col-1 > 0)
            list.addAll(getPaths(path+"R", row, col-1));

        return list;
    }


    static void printPath(String path, int row, int col){

        if(row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if(row-1 > 0)
            printPath(path+"D", row-1, col);
        if(col-1 > 0)
            printPath(path+"R", row, col-1);
    }
}
