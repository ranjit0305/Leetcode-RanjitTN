class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int dayIndex = 0;

        for (int i = 1; i <= 365; i++) {
            if (dayIndex < days.length && days[dayIndex] == i) {
                int cost1 = dp[i - 1] + costs[0]; // 1-day pass
                int cost7 = dp[Math.max(0, i - 7)] + costs[1]; // 7-day pass
                int cost30 = dp[Math.max(0, i - 30)] + costs[2]; // 30-day pass
                
                // Take the minimum of the three options
                dp[i] = Math.min(cost1, Math.min(cost7, cost30));
                dayIndex++;
            } else {
                // If it's not a travel day, just carry forward the previous cost
                dp[i] = dp[i - 1];
            }
        }

        // The answer is the minimum cost to cover all travel days
        return dp[365];
    }
}