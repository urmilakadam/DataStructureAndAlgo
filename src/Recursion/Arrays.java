package Recursion;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        changeArray(arr, 0, 1);
        System.out.println(java.util.Arrays.toString(arr));
    }

    private static void changeArray(int[] arr, int i, int val){
        if(i == arr.length){
            System.out.println(java.util.Arrays.toString(arr));
            return;
        }

        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;

    }
}
