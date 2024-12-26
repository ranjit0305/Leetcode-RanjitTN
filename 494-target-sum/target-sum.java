class Solution {
    private int[] arr;
    
    private void run(int id, int target, int[] c, int sum) {
        if (id == arr.length) {
            if (target == sum) {
                c[0]++;
            }
            return;
        }
        run(id + 1, target, c, sum - arr[id]);
        run(id + 1, target, c, sum + arr[id]);
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        arr = nums;
        int[] c = new int[1];
        run(0, target, c, 0);
        return c[0];
    }
}