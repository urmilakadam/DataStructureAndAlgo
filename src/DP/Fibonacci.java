package DP;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fib with array "+ fib(48));
        System.out.println("Fib with memorization "+ fibMemo(48, new HashMap<>()));
        System.out.println("Fib with recursion "+ fibRec(48));
    }

    public static int fib(int num){
        int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<=num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[num];
    }

    public static int fibRec(int num){
        if(num<=1) return num;

        return fibRec(num-1) + fibRec(num-2);
    }

    public static int fibMemo(int num, Map<Integer, Integer> map){
        if(num<=1) return num;
        if(map.containsKey(num))
            return map.get(num);

        int result = fibMemo(num-1, map) + fibMemo(num-2, map);
        map.put(num, result);
        return result;
    }
}
