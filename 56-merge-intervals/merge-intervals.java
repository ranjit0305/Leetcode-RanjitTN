import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] arr = new int[intervals.length][2];
        int k = 0;
        for (int i = 0; i < intervals.length; i++) {
            arr[k][0] = intervals[i][0];
            arr[k][1] = intervals[i][1];
            while (i < intervals.length - 1 && arr[k][1] >= intervals[i + 1][0]) {
                arr[k][1] = Math.max(arr[k][1], intervals[i + 1][1]);
                i++;
            }
            k++;
        }
        return Arrays.copyOf(arr, k);
    }
}
