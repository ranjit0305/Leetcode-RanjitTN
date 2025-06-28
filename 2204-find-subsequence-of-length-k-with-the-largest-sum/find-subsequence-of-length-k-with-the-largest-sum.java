import java.util.Arrays;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] original = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        int temp_index = k;
        int i = nums.length - 1;
        while (temp_index > 0 && i >= 0) {
            temp.add(nums[i]);
            temp_index--;
            i--;
        }
        int[] result = new int[k];
        int index = 0;
        for (i = 0; i < original.length && index < k; i++) {
            for (int j = 0; j < k; j++) {
                if (original[i] == temp.get(j)) {
                    result[index] = original[i];
                    temp.set(j,Integer.MIN_VALUE);
                    index++;
                    break;
                }
            }
        }
        return result;
    }
}