public class Problem121 {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));

        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int curr = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            curr = price - min;
            if (profit < curr) {
                profit = curr;
            }
        }
        return profit;
    }
}
