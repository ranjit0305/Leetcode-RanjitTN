class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) 
    {
        int cnt=0;
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int i=0;
        while(truckSize>0 && i<boxTypes.length)
        {
            if(boxTypes[i][0]>truckSize)
            {
                cnt=cnt+(truckSize*boxTypes[i][1]);
                truckSize=0;
            }
            else
            {
                cnt=cnt+(boxTypes[i][0]*boxTypes[i][1]);
                truckSize=truckSize-boxTypes[i][0];
                i++;
            }
        }
        return cnt;
    }
}