class Solution {
    public int countPrimeSetBits(int left, int right) 
    {
        int cnt=0;
        for(int i=left;i<=right;i++)
        {
            String bin=Integer.toBinaryString(i);
            int setcnt=0;
            for(int j=0;j<bin.length();j++)
            {
                if(bin.charAt(j)=='1')
                {
                    setcnt++;
                }
            }
            if(isPrime(setcnt))
            {

                cnt++;
            }
        }
        return cnt;
    }
    public boolean isPrime(int n)
    {
        if (n==1)
        {
            return false;
        }
        if (n==2)
        {
            return true;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}