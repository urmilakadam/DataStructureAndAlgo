package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        permutations("abc", "");
        System.out.println(permutationsWithList("abc", ""));
        System.out.println(countPermutations("abc", ""));
    }

    static void permutations(String input, String output){

        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        for(int i=0; i<=output.length(); i++){
            String pre = output.substring(0 ,i);
            String post = output.substring(i);
             permutations(input.substring(1), pre + ch + post );
        }

    }


    static List<String > permutationsWithList(String input, String output){

        if(input.isEmpty()){
            List<String > list = new ArrayList<>();
            list.add(output);
            return list;
        }

        List<String> result = new ArrayList<>();
        char ch = input.charAt(0);

        for(int i=0; i<=output.length(); i++){
            String pre = output.substring(0 ,i);
            String post = output.substring(i, output.length());
            result.addAll(permutationsWithList(input.substring(1), pre + ch + post));
        }

        return result;
    }


    static int countPermutations(String input, String output){

        if(input.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = input.charAt(0);

        for(int i=0; i<=output.length(); i++){
            String pre = output.substring(0 ,i);
            String post = output.substring(i, output.length());
            count += countPermutations(input.substring(1), pre + ch + post);
        }

        return count;
    }
}