package DynamicProgramming;

import java.util.Arrays;

public class fibonacciNumber {
//    recurrsion
    public static int fib(int n){

        if(n<=1){
            return n;
        }
        int x = fib(n-1)+fib(n-2);
        return x;
    }

//    Duynamic programming
    public int topDown(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return topDown(n-1,dp)+topDown(n-2,dp);
    }
     int fibbo(int n){
        int[] dp = new int[n];
         Arrays.fill(dp,-1);
        return topDown(n-1,dp);
    }

    int bottumUp(int n){
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<n ;i++){
            dp[i] = dp[i-1] +dp[i-2];

        }
        return dp[n-1];
    }

    int spaceOptimize(int n){
        int curr=0;
        int prev=1;
        int prevL = 0;
        for(int i=2;i<n;i++){
            curr = prev + prevL;
            prevL=prev;
            prev = curr;
        }
        return curr;
    }


    public static void main(String[] args) {
        int n=9;
        int result;
//        result = fib(n);
//        System.out.println(result);
        fibonacciNumber obj = new fibonacciNumber();
        result = obj.fibbo(n);
        System.out.println(result);

        int result1 = obj.bottumUp(n);
        System.out.println(result1);

        int result2 = obj.spaceOptimize(n);
        System.out.println(result2);

        StringBuilder s = new StringBuilder("Arshad");
        s.setCharAt(1,'s');
        System.out.println(s);
    }
}
