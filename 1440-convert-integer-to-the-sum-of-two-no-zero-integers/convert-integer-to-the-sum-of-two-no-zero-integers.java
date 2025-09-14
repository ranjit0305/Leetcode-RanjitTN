class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isNoZero(a) && isNoZero(b)) {
                ans[0] = a;
                ans[1] = b;
                return ans;
            }
        }
        return ans;
    }
    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
}
