class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, max = 0;
        for(int r=l+1; r<prices.length; r++) {
            if(prices[r] < prices[l]) {
                l=r;
                continue;
            }
            max = Math.max(max, prices[r] - prices[l]);
        }
        return max;
    }
}
