class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        solve(1, 0, k, n, res, new ArrayList<>());
        return res;
    }

    public void solve(int num, int sum, int k, int n, List<List<Integer>> res, List<Integer> temp) {
        if (temp.size() == k && sum == n) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (temp.size() > k || sum > n) {
            return;
        }
        for (int i = num; i <= 9; i++) {
            temp.add(i);
            solve(i + 1, sum + i, k, n, res, temp); // ✅ fixed here
            temp.remove(temp.size() - 1);
        }
    }
}
