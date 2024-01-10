package DP;

import java.util.Arrays;

public class MinCoinChange {

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int i=1;i<=amount;i++)
            for(int c:coins)
                if(i>=c)
                    dp[i]=Math.min(dp[i],dp[i-c]+1);

        return dp[amount]>amount?-1:dp[amount];
    }
}
