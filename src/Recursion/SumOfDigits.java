package Recursion;

public class SumOfDigits {

    //1435 ans: 1+4+3+5 = 13
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1435));
    }

    private static int sumOfDigits(int num){
        if(num == 0)
            return 0;

        return num%10 + sumOfDigits(num/10);
    }

}
