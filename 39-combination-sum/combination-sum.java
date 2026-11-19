
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();

        helper(0, candidates, temp, temp1, target);

        return temp;
    }
    public void helper(int index, int[] candidates,
                       List<List<Integer>> ans,
                       List<Integer> temp, int target) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (index == candidates.length || target < 0) {
            return;
        }
        // Take
        temp.add(candidates[index]);
        helper(index, candidates, ans, temp,
               target - candidates[index]);
        // Backtrack
        temp.remove(temp.size() - 1);
        // Not take
        helper(index + 1, candidates, ans, temp, target);
    }
}
