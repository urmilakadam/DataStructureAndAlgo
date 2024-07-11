package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,8,10,14,15,20,23,28};
        int key = 5;
        boolean isFound = binarySearch(nums, 0, nums.length - 1, key);
        System.out.println(isFound);
    }

    private static boolean binarySearch(int[] nums, int start, int end, int key){
        int mid = (start + end) / 2;

        if(start > end)
            return false;

        if(nums[mid] == key)
            return true;
        else if(nums[mid] < key)
            return binarySearch(nums,mid+1, end, key);
        else
            return binarySearch(nums, start, mid - 1, key);
    }
}
