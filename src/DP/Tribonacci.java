package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tribonacci {

    public static void main(String[] args) {
        System.out.println("Fib with array "+ trib(48));
        System.out.println("Fib with memorization "+ tribMemo(48, new HashMap<>()));
    }

    public static int trib(int n){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);

        for(int i = 3 ; i<=n; i++){
            int result = list.get(i-1) + list.get(i-2) + list.get(i-3);
            list.add(result);
        }
        return list.get(n);
    }

    public static int tribMemo(int num, Map<Integer, Integer> map){
        if(num==1 || num==2) return 1;
        if(num < 1) return 0;
        if(map.containsKey(num))
            return map.get(num);

        int result = tribMemo(num-1, map) + tribMemo(num-2, map) + tribMemo(num-3, map);
        map.put(num, result);
        return result;
    }
}
