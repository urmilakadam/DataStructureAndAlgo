package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};

        for(int i=0; i<array.length; i++){
            int largest = 0;
            for(int j=1; j<array.length-i-1; j++){
                if(array[j]>array[largest])
                    largest = j;
            }
            int temp = array[array.length-i-1];
            array[array.length-i-1] = array[largest];
            array[largest] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
