class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = 0; // Total bottles drunk
        int emptyBottles = 0; // Empty bottles accumulated

        while (numBottles > 0) {
            totalDrunk += numBottles; // Drink all current full bottles
            emptyBottles += numBottles; // Add to the empty bottles

            // Exchange empty bottles for full ones
            numBottles = emptyBottles / numExchange;
            emptyBottles %= numExchange; // Leftover empty bottles
        }

        return totalDrunk;
    }
}
