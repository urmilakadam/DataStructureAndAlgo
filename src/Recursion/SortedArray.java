package Recursion;

public class SortedArray {

    public static void main(String[] args) {
        int[] nums = {2,3,4,6,8,7,9,12};
        System.out.println(checkIfArraySorted(nums, 0, nums.length));
    }

    private static boolean checkIfArraySorted(int[] nums, int start, int end){
        if(start+1 == end) return true;

        if(start+1 < end && nums[start] > nums[start+1])
            return false;

        return checkIfArraySorted(nums, start+1, end);
    }
}
