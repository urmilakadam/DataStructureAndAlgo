package DP;

import java.util.*;

public class AllConstruct {
    
    public static List<List<String>> allConstruct(String target, String[] wordBank, Map<String, List<List<String>>> memo){
        if(target.isEmpty())
            return List.of(List.of());

        if(memo.containsKey(target))
            return memo.get(target);

        List<List<String>> result = new ArrayList<>();
        for(String word: wordBank){
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = allConstruct(suffix, wordBank, memo);

                for(List<String> ways : suffixWays){
                    List<String> newWays = new ArrayList<>();
                    newWays.add(word);
                    newWays.addAll(ways);
                    result.add(newWays);
                }
            }
        }
        memo.put(target, result);
        return result;
    }

    public static void main(String[] args) {
        String[] wordBank = {"purp", "p", "ur", "le", "purpl"};

        String target = "purple";

        System.out.println(allConstruct(target, wordBank, new HashMap<>()));
    }
}
