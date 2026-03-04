class Solution {
    public int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<Integer> arr=new ArrayList<>(); 
        arr.add(intervals[0][0]);
        int max=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=max)
            {
                max = Math.max(max, intervals[i][1]);
            }
            else if(intervals[i][0]>max)
            {
                arr.add(max);
                arr.add(intervals[i][0]);
                max=intervals[i][1];
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