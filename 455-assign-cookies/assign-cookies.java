import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int cnt = 0;

        while (i < m && j < n) {
            if (s[j] >= g[i]) {
                cnt++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return cnt;
    }
}