class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums1) {
            if (set2.contains(num)) {
                resultSet.add(num); // avoids duplicates
            }
        }

        int[] res = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            res[i++] = num;
        }

        return res;
    }
}
