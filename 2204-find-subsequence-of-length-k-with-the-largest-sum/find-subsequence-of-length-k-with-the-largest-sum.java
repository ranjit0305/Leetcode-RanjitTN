import java.util.Arrays;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] original = Arrays.copyOf(nums, nums.length);
        // Step 2: Sort to get top k elements
        Arrays.sort(nums);
        int[] topK = Arrays.copyOfRange(nums, nums.length - k, nums.length); // largest k elements
        // Step 3: Fill result with topK elements in original order
        int[] result = new int[k];
        int index = 0;
        for (int i = 0; i < original.length && index < k; i++) {
            for (int j = 0; j < k; j++) {
                if (original[i] == topK[j]) {
                    result[index++] = original[i];
                    topK[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return result;
    }
}
