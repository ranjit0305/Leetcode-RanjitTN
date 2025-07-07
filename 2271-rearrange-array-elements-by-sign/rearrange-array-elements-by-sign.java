class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, p = 0, ng = 0;
        while (i < n) {
            if (i % 2 == 0) res[i++] = pos.get(p++);
            else res[i++] = neg.get(ng++);
        }

        return res;
    }
}
