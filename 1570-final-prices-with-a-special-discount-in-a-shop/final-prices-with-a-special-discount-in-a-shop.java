class Solution {
    public int[] finalPrices(int[] prices) {
        int sub = 0;
        for (int i = 0; i < prices.length; i++) 
        {
            sub = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    sub = prices[j];
                    break;
                }
            }
            prices[i] = prices[i] - sub;
            
        }
         return prices;
    }
}
