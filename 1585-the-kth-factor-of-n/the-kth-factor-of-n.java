import java.util.ArrayList;
import java.util.List;

class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
            }
        }
        if (res.size() < k) {
            return -1;
        }
        return res.get(k - 1); // Adjusted the index to k - 1
    }
}
