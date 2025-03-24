import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int cnt = 0, lastEnd = 0;

        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];

            if (start > lastEnd + 1) {
                cnt += start - lastEnd - 1;
            }

            lastEnd = Math.max(lastEnd, end);
        }

        if (lastEnd < days) {
            cnt += days - lastEnd;
        }

        return cnt;
    }
}
