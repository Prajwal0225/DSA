// Grid ways
// Right turns = no of cols = m
// Down turns = no of rows = n

//? Time complexity : O(2^n+m) ->Exponential time complexity

//! Math trick for liner time complexity
//? Formula
/*
 * (n-1)(m-1)! / (n-1)! (m-1)!
 */

public class GridWays {

    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condn for last cell
            return 1;
        } else if (i == n || j == n) { // boundary cross condn
            return 0;
        }
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
