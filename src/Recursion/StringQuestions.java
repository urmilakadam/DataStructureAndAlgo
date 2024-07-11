package Recursion;

public class StringQuestions {

    public static void main(String[] args) {
        System.out.println(removeaFromString("bcabcabab"));
    }

    private static String removeaFromString(String str){
        if(str.isEmpty()) return "";

        char ch = str.charAt(0);
        if(ch == 'a')
            return removeaFromString(str.substring(1));
        else
            return ch + removeaFromString(str.substring(1));
    }
}
