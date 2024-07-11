package Recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> lists = subSet(arr);
        System.out.println(lists);

        List<List<Integer>> subSetDuplicate = subSetDuplicate(new int[]{1, 2, 2});
        System.out.println(subSetDuplicate);
    }

    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> subSets = new ArrayList<>();

        subSets.add(new ArrayList<>());

        for(int num: arr){
            int size = subSets.size();
            for (int i = 0; i <size ; i++) {
                List<Integer> hold = new ArrayList<>(subSets.get(i));
                hold.add(num);
                subSets.add(hold);
            }
        }

        return subSets;
    }

    static List<List<Integer>> subSetDuplicate(int[] arr){

        Arrays.sort(arr);
        List<List<Integer>> subSets = new ArrayList<>();

        subSets.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0; i<arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            int size = subSets.size();
            end = size - 1;
            for (int j = start; j <size ; j++) {
                List<Integer> hold = new ArrayList<>(subSets.get(j));
                hold.add(arr[i]);
                subSets.add(hold);
            }
        }

        return subSets;
    }
}
