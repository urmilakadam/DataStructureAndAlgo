package Recursion;

public class ReverseNumber {
    private static int result = 0;
    public static void main(String[] args) {
        reverseNumber(1234);
        System.out.println(result);
    }

    private static void reverseNumber(int num){
        if(num == 0)
             return;
        result = result * 10 + num%10;
        reverseNumber(num/10);
    }
}
