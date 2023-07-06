import java.util.*;

//Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.
public class Climbing_Stairs_Problem {

    // recursion -> O(2^n)
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return countWays(n - 1) + countWays(n - 2);
    }

    // memoization - O(n)
    public static int countWaysMemoization(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }

        ways[n] = countWaysMemoization(n - 1, ways) + countWaysMemoization(n - 2, ways);
        return ways[n];
    }

    // Tabulation - O(n)
    public static int countWaysTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5; // n=3 -> 3 & n = 4 -> 5
        int ways[] = new int[5 + 1];
        Arrays.fill(ways, -1);
        System.out.print(countWaysTabulation(n));
    }
}
