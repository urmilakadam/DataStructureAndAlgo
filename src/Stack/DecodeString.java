package Stack;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        String decodeString = decodeString(s);

        System.out.println(decodeString);
    }

    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();


        for(int i =0; i<chars.length; i++){
            if(chars[i] == ']'){
                String str = "";
                while(stack.peek() != '['){
                    char top = stack.pop();
                    if(Character.isLowerCase(top))
                        str = top + str;
                    if(Character.isDigit(top))
                        str = top + str;
                }
                stack.pop();
            }else
                stack.push(chars[i]);
        }



        return stack.toString();
    }
}
