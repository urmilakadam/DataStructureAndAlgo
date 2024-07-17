package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    public static void main(String[] args) {
        List<String> combinations = letterCombinations("12");
        System.out.println(combinations);
    }


    static List<String> letterCombinations(String digits){
        List<String> list = new ArrayList<>();
        process("", digits, list);
        return list;
    }

    static void process(String p, String up, List<String> result){
        if(up.isEmpty()){
            result.add(p);
            return;
        }
        int digit = up.charAt(0) - '0';

        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a' + i);
            process(p+ch, up.substring(1), result);
        }
    }
}
