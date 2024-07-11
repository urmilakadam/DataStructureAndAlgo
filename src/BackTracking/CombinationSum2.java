package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> lists = combinationSum2(candidates, target);

        System.out.println(lists);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if(i > start && candidates[i] == candidates[i-1]) continue;
            list.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], list, i+1);
            list.removeLast();
        }
    }
}
