class Solution {
    public int maxProfit(int[] prices) {
        int[] maxs = new int[prices.length];
        maxs[0] = prices[0];

        int max = prices[prices.length - 1];;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxs[i] = max;

            if (max < prices[i]) {
                max = prices[i];
            }

        }

        max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (maxs[i] - prices[i] > max) {
                max = maxs[i] -  prices[i];
                System.out.println(max);
            }
        }

        return max;
    }
}
