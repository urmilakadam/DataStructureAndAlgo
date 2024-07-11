package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionBasic1 {

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        numberPrint(10);
        list.forEach(System.out::println);
    }

    private static void numberPrint(int num){
        if(num <= 0) return;

        list.add(num * 10);
        numberPrint(num-1);
        list.remove(Integer.valueOf(num));
    }
}
