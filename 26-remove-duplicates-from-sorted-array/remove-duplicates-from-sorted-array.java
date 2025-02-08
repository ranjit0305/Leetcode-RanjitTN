class Solution {
    public int removeDuplicates(int[] nums) {
        int min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        int[] freq = new int[max - min + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                nums[index] = i + min;
                index++;
            }
        }

        return index;
    }
}
