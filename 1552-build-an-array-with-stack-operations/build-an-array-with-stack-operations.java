class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> arr = new ArrayList<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (j == target.length) break;
            arr.add("Push");
            if (target[j] != i) {
                arr.add("Pop");
            } else {
                j++;
            }
        }

        return arr;
    }
}
