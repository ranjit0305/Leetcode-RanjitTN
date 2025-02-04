class Solution {
    public int minMoves(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int totalMoves = 0;
        for (int num : nums) {
            minValue = Math.min(minValue, num);
        }
        for (int num : nums) {
            totalMoves += (num - minValue);
        }
        return totalMoves;
    }
}
