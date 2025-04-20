class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 1;
        int prev = 0;
        for (int curr = 1; curr < points.length; curr++) { 
            if (points[curr][0] > points[prev][1]) {
                res++;
                prev = curr;
            }
        }
        return res;
    }
}
