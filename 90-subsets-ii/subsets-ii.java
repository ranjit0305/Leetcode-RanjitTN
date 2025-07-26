import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // ✅ To handle duplicates
        solve(0, nums, res, new ArrayList<>(), false);
        return res;
    }

    public void solve(int idx, int[] nums, List<List<Integer>> res, List<Integer> temp, boolean takenPrev) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        // ❌ Skip the current element
        solve(idx + 1, nums, res, temp, false);
        // ✅ Include only if not a duplicate or if previous duplicate was taken
        if (idx > 0 && nums[idx] == nums[idx - 1] && !takenPrev) {
            return;
        }
        // ✅ Take the current element
        temp.add(nums[idx]);
        solve(idx + 1, nums, res, temp, true);
        temp.remove(temp.size() - 1);
    }
}
