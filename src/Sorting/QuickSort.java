package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 10, 15, 18, 25};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int si, int ei){
        if(si>=ei) return;
        int pivot = findPivot(nums, si, ei);
        quickSort(nums, si, pivot-1);
        quickSort(nums, pivot+1, ei);

    }

    private static int findPivot(int[] nums, int si, int ei) {

        int pivot = nums[ei];
        int i = si;

        for (int j = si; j < ei; j++) {
            if(nums[j] <= pivot){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }

        int temp = pivot;
        nums[ei] = nums[i];
        nums[i] = temp;

        return i;
    }

}
