class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        int[] marked = new int[groupSizes.length];
        Arrays.fill(marked, 0);

        for (int i = 0; i < groupSizes.length; i++) {
            if (marked[i] == 1) continue;

            int size = groupSizes[i];
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            marked[i] = 1;

            for (int j = 0; j < groupSizes.length && temp.size() < size; j++) {
                if (marked[j] == 0 && groupSizes[j] == size) {
                    temp.add(j);
                    marked[j] = 1;
                }
            }
            res.add(temp);
        }
        return res;
    }
}
