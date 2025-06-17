class Solution {
    public int[] evenOddBit(int n) 
    {
        int[] len=new int[2];
        int odd=0;
        int even=0;
        String l=Integer.toBinaryString(n);
        for(int i=0;i<l.length();i++)
        {
            if(l.charAt(l.length()-1-i)=='1')
            {
                if(i%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        }    
        len[0]=even;
        len[1]=odd;
        return len;
    }
}