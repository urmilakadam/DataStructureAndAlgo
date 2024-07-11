package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet2 {

    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4};
        Arrays.sort(arr);
        List<List<Integer>> subSet = new ArrayList<>();
        backtrack(subSet, new ArrayList<>(), arr, 0);
        System.out.println(subSet);
    }

    static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.removeLast();
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subSets = new ArrayList<>();
        Arrays.sort(nums);
        subSets.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start = 0;
            if(i > 0 && nums[i] == nums[i-1]){
                start = end + 1;
            }
            int size = subSets.size();
            end = size - 1;
            for (int j = start; j <size ; j++) {
                List<Integer> hold = new ArrayList<>(subSets.get(j));
                hold.add(nums[i]);
                subSets.add(hold);
            }
        }

        return subSets;
    }

}
