class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;

        for(int num : cardPoints) {
            total += num;
        }

        if(k == cardPoints.length) {
            return total;
        }

        int window = cardPoints.length-k;
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0; right < cardPoints.length; right++) {
            sum += cardPoints[right];

            if(right-left+1 == window) {
                min = Math.min(min, sum);
                sum -= cardPoints[left];
                left++;
            }
        }

        return total-min;
    }
}