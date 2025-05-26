class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int start = 0;
        int end = 1;
        if (nums.length == 0) return arr;
        if (nums.length == 1) {
            arr.add(nums[0] + "");
            return arr;
        }
        while (start < nums.length) {
            int s = nums[start];
            while (end < nums.length && nums[end] - nums[end - 1] == 1) {
                end++;
            }
            int e = nums[end - 1];
            temp.add(s);
            temp.add(e);
            start = end;
            end = start + 1;
        }
        int i = 0;
        while (i < temp.size()) {
            int a = temp.get(i);
            int b = temp.get(i + 1);
            if (a == b)
                arr.add(String.valueOf(a));
            else
                arr.add(a + "->" + b);
            i += 2;
        }
        return arr;
    }
}
