public class Problem121 {
    public static void main(String[] args) {
        int[] prices = {1, 2};
        System.out.println(maxProfit(prices));

        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int index = 0;

        for (int i : prices) {
            if (i < min) {
                min = i;
            }
            index = i - min;
            if (profit < index) {
                profit = index;
            }
        }
        return profit;
    }
}
