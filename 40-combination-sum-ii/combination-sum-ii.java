class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            
            if (candidates[i] > target) break; // No point in continuing if the current candidate exceeds the target

            current.add(candidates[i]); // Choose the candidate
            backtrack(candidates, target - candidates[i], i + 1, current, result); // Move to the next candidate
            current.remove(current.size() - 1); // Backtrack
        }
    }
}