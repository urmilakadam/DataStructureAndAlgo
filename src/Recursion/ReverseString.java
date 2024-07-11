package Recursion;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("urmila"));
    }

    public static String reverseString(String str) {
        if(str.isEmpty()) return "";
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
