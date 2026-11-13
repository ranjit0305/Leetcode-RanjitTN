
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        if(intervals.length == 0)
            return 0;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

        int cnt=1;
        int endtime=intervals[0][1];

        for(int i=1;i<intervals.length;i++)
        {
            if(endtime<=intervals[i][0])
            {
                cnt++;
                endtime=intervals[i][1];
            }
        }

        return intervals.length-cnt;
    }
}
