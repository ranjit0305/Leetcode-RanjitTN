class Solution {
    public int differenceOfSums(int n, int m) {
        int fullsum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {
            fullsum=fullsum+i;
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                fullsum=fullsum-i;
            }
        }
        return fullsum;
    }
}