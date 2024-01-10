package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] num, int si, int ei){

        if(si >= ei) return;

        int mid = si + (ei-si)/2;

        mergeSort(num, si, mid);
        mergeSort(num, mid+1, ei);
        merge(num, mid, si, ei);
    }

    public static void merge(int[] num, int mid, int si, int ei){
        int[] temp = new int[ei-si+1];
        int i = si, j = mid+1;
        int k=0;

        while(i<= mid && j<=ei){
            if(num[i] < num[j])
                temp[k++] = num[i++];
            else
                temp[k++] = num[j++];
        }

        while(i<= mid)
            temp[k++] = num[i++];

        while(j<= ei)
            temp[k++] = num[j++];

        for(k=0, i=si; k<temp.length; k++, i++){
            num[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,5,3,4,8,1,7,5};
        mergeSort(nums,0, 7);
        System.out.println(Arrays.toString(nums));
    }
}
