import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> maxSubset = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (subsets.get(j).size() > current.size()) {
                        current = new ArrayList<>(subsets.get(j));
                    }
                }
            }
            current.add(nums[i]);
            subsets.add(current);
            if (current.size() > maxSubset.size()) {
                maxSubset = current;
            }
        }
        return maxSubset;
    }
}
