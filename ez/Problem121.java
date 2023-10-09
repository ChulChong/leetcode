public class Problem121 {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));

        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] - prices[j] < 0 && min > prices[i] - prices[j]) {
                    min = prices[i] - prices[j];
                }
            }
        }
        if (min == Integer.MAX_VALUE) return 0;

        return Math.abs(min);
    }
}
