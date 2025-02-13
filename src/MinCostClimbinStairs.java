import java.util.Arrays;

public class MinCostClimbinStairs {
    int way (int i, int[] cost, int[] dp){
        if(i<=1){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        return dp[i] = Math.min(cost[i-1]+way(i-1,cost,dp), cost[i-2]+way(i-2,cost,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return way(n,cost,dp);

    }

    public static void main(String[] args) {
        
    }
}
