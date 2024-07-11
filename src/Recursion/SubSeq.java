package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {

    public static void main(String[] args) {
        subSet("abc", "", 0);
        subSet1("abc", "");
        subSetWithArrayList("abc", "").forEach(System.out::println);
    }

    private static void subSet(String str, String result, int i){
        if(i == str.length()) {
            System.out.println(result);
            return;
        }

         subSet(str, result + str.charAt(i), i+1);
         subSet(str, result, i+1);
    }

    private static void subSet1(String inputstr, String result){
        if(inputstr.isEmpty()) {
            System.out.println(result);
            return;
        }
        char ch = inputstr.charAt(0);
        subSet1(inputstr.substring(1), result + ch);
        subSet1(inputstr.substring(1), result);
    }

    private static List<String> subSetWithArrayList(String inputstr, String result){
        if(inputstr.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }
        char ch = inputstr.charAt(0);
        List<String> left = subSetWithArrayList(inputstr.substring(1), result + ch);
        List<String> right = subSetWithArrayList(inputstr.substring(1), result);

        left.addAll(right);
        return left;
    }

}
