class Solution {
    public boolean threeConsecutiveOdds(int[] arr) 
    {
        int[] prefixodd=new int[arr.length];
        if(arr[0]%2==0)
        {
        prefixodd[0]=0;
        }
        else
        {
            prefixodd[0]=1;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                prefixodd[i]=prefixodd[i-1]+1;
            } 
            else
            {
                prefixodd[i]=0;
            }
        }
        Arrays.sort(prefixodd);
        if(prefixodd[prefixodd.length-1]<3)
        {
            return false;
        }
        return true;
    }
}