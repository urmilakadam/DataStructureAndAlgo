package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = combinationSum(candidates, target);

        System.out.println(lists);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSum(candidates, target, new ArrayList<>(), 0);
        return result;
    }

    private static void combinationSum(int[] candidates, int target, List<Integer> list, int start){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(target < 0)
            return;

        for (int i = start; i< candidates.length; i++) {
            list.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], list, i);
            list.removeLast();
        }
    }
}
