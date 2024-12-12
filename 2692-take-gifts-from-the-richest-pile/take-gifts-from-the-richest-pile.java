import java.util.Arrays;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            // Sort the array in ascending order
            Arrays.sort(gifts);
            // Process the largest element (last in the sorted array)
            gifts[gifts.length - 1] = (int) Math.floor(Math.sqrt(gifts[gifts.length - 1]));
        }
        
        // Calculate the sum of the remaining gifts
        long sum = 0;
        for (int gift : gifts) {
            sum += gift;
        }
        
        return sum;
    }
}
