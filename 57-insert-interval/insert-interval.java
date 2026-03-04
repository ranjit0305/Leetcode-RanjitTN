class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        int[][] newintervals=new int[intervals.length+1][2];
        for(int i=0;i<newintervals.length-1;i++)
        {
            newintervals[i][0]=intervals[i][0];
            newintervals[i][1]=intervals[i][1];
        }
        newintervals[newintervals.length-1][0]=newInterval[0];
        newintervals[newintervals.length-1][1]=newInterval[1];
        Arrays.sort(newintervals,(a,b)->a[0]-b[0]);
        List<Integer> arr=new ArrayList<>(); 
        arr.add(newintervals[0][0]);
        int max=newintervals[0][1];
        for(int i=1;i<newintervals.length;i++)
        {
            if(newintervals[i][0]<=max)
            {
                max = Math.max(max,newintervals[i][1]);
            }
            else if(newintervals[i][0]>max)
            {
                arr.add(max);
                arr.add(newintervals[i][0]);
                max=newintervals[i][1];
            }
        }
        arr.add(max);
        int n=arr.size()/2;
        int[][] res=new int[n][2];
        int j=0;
        int k=0;
        int[] temp = new int[2];
         int idx = 0;
        for(int i=0;i<arr.size();i+=2)
        {
            res[idx][0] = arr.get(i);
            res[idx][1] = arr.get(i+1);
            idx++;
        }
        return res;
    }
}