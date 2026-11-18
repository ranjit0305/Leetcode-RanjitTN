class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        int [][] res = new int[intervals.length+1][2];

        for(int i=0; i<intervals.length; i++)
        {
            res[i] = intervals[i];
        }
        res[intervals.length] = newInterval;
        Arrays.sort(res, (a,b) -> Integer.compare(a[0], b[0]));
        List<Integer> temp = new ArrayList<>();
        temp.add(res[0][0]);
        int endtime = res[0][1];
        for(int i=1; i<res.length; i++)
        {
            if(endtime < res[i][0])
            {
                temp.add(endtime);
                temp.add(res[i][0]);
                endtime = res[i][1];
            }
            else
            {
                endtime = Math.max(endtime, res[i][1]);
            }
        }
        temp.add(endtime);
        int ans[][] = new int[temp.size()/2][2];
        int j=0;
        for(int i=0; i<temp.size(); i=i+2)
        {
            ans[j][0] = temp.get(i);
            ans[j][1] = temp.get(i+1);
            j++;
        }
        return ans;
    }
}