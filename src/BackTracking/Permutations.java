package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permutations(nums, new ArrayList<>());
        System.out.println(result);
    }

    static void permutations(int[] nums, List<Integer> list){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (list.contains(num)) continue;
            list.add(num);
            permutations(nums, list);
            list.removeLast();
        }

    }
}
