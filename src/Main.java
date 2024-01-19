//https://leetcode.com/problems/climbing-stairs/solutions/3708750/4-method-s-beat-s-100-c-java-python-beginner-friendly/?envType=daily-question&envId=2024-01-18
class Solution {
    public static int climbStairs(int n)  {
        if (n<=3) return n;

        int[] dp = new int[n+1];
        dp[0]=dp[1]=1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.climbStairs(5));
    }
}