package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {2,4,5,7,4,8,9,2,12,4,23,45,64,4,78};

        boolean targetPresent = isTargetPresent(nums, 94, 0);
        System.out.println(targetPresent);

        List<Integer> allIndexWith = getAllIndexWith(nums, 4, 0);
        System.out.println(allIndexWith);

    }

    private static boolean isTargetPresent(int[] nums, int target, int index){
        if(index == nums.length)
            return false;
        if(target == nums[index])
            return true;
        return isTargetPresent(nums, target, index+1);
    }

    private static List<Integer> getAllIndexWith(int[] nums, int target, int index){
        List<Integer> list = new ArrayList<>();
        if(index == nums.length)
            return list;
        if(target == nums[index])
            list.add(index);

        List<Integer> indexWith = getAllIndexWith(nums, target, index + 1);

        list.addAll(indexWith);
        return list;
    }
}
