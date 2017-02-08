package dynamicProgramming;

/**
 * Created by liuhang on 2017/1/27.
 * 股票买卖系列leetcode
 */
public class Stock {
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        if (prices.length <= 1) return maxProfit;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        int maxProfit = 0;
        if (prices.length <= 1) return maxProfit;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static int maxProfit3(int[] prices) {
        int maxProfit = 0;
        int length = prices.length;
        if (length <= 1) return maxProfit;
        int[] leftProfit = new int[length];
        int[] rightProfit = new int[length];
        int leftMin = prices[0];
        for (int i = 1; i < length; i++) {
            leftProfit[i] = Math.max(prices[i] - leftMin, leftProfit[i - 1]);
            leftMin = Math.min(prices[i], leftMin);
        }
        int rightMax = prices[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightProfit[i] = Math.max(rightMax - prices[i], rightProfit[i + 1]);
            rightMax = Math.max(prices[i], rightMax);
        }
        for (int i = 0; i < length; i++) {
            if (leftProfit[i] + rightProfit[i] > maxProfit)
                maxProfit = leftProfit[i] + rightProfit[i];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit1(prices));
        System.out.println(maxProfit2(prices));
        System.out.println(maxProfit3(prices));
    }
}
