package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subSet(arr,0,new ArrayList<>());
        System.out.println(result);

        List<List<Integer>> subSet = new ArrayList<>();
        backtrack(subSet, new ArrayList<>(), arr, 0);
        System.out.println(subSet);
    }

    static void subSet(int[] arr, int index, List<Integer> list){
        if(index == arr.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[index]);
        subSet(arr, index+1, list);
        list.removeLast();
        subSet(arr, index+1, list);
    }

    static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.removeLast();
        }
    }


}
