class Solution {
    public long sumAndMultiply(int n) 
    {
        String s="";
        int sum=0;
        if(n==0) return 0;
        while(n!=0)
        {
            int temp=n%10;
            if(temp!=0)
            {
            s=s+Integer.toString(temp);
            sum=sum+temp;
            }
            n=n/10;
        }    
        String reversed = new StringBuilder(s).reverse().toString();
    long r=Long.parseLong(reversed);
    return r*sum;   
        
    }
}