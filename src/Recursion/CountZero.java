package Recursion;

public class CountZero {
    static int count = 0;
    public static void main(String[] args) {
        countZeros(20304);
        System.out.println(count);
    }

    private static void countZeros(int num){

        if(num < 10) return;

        if(num%10 == 0)
            count++;
        countZeros(num/10);
    }
}
