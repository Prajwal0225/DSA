import java.util.*;

public class BuyansSellStock {
    // My approach
    public static int buyAndSell(int prices[]) {

        int profit = 0;
        int n = prices.length;
        int aux[] = new int[n];

        aux[0] = prices[0];

        int pro = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] < pro) {
                pro = prices[i];
            }
            aux[i] = pro;
        }

        for (int i = 0; i < n; i++) {
            aux[i] = prices[i] - aux[i];
        }

        for (int i = 0; i < n; i++) {
            if (aux[i] > profit) {
                profit = aux[i];
            }
        }
        return profit;

    }

    // other approach
    public static int buyandsell_Another_Approach(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
        // Time Coplexity: O(n)
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsell_Another_Approach(prices));
    }
}
