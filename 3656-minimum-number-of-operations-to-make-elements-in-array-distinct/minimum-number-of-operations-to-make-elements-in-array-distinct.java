import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        while (true) {
            // Check if list has all distinct elements
            Set<Integer> set = new HashSet<>(list);
            if (set.size() == list.size()) break; // done

            // Perform one operation: remove first 3 elements
            for (int i = 0; i < 3 && !list.isEmpty(); i++) {
                list.remove(0);
            }

            cnt++;
        }

        return cnt;
    }
}
