package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {

    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] dice = {1,2,3,4,5,6};
        int number = 4;
        throwDice(dice, number, new ArrayList<>(), 0);
        System.out.println(result);
    }

    static void throwDice(int[] dice, int num, List<Integer> list, int start){

        if(num == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(num < 0) return;

        for (int i=start; i<dice.length; i++){
            list.add(dice[i]);
            throwDice(dice,num-dice[i], list, i);
            list.removeLast();
        }

    }
}
