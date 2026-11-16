class Solution {
    public String digitSum(String s, int k) 
    {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>k)
        {
            String temp="";
            int n=sb.length()/k;
            for(int i=0;i<n;i++)
            {
                String temp1=sb.substring(0,k);
                sb.delete(0,k);
                int sum=0;    
                for(int j=0;j<temp1.length();j++)
                {
                    sum=sum+Integer.parseInt(String.valueOf(temp1.charAt(j)));
                }
                temp=temp+Integer.toString(sum);
            }
            int sum=0;
            //remaining of sb
            if(sb.length()>0)
            {
            for(int j=0;j<sb.length();j++)
            {
                    sum=sum+Integer.parseInt(String.valueOf(sb.charAt(j)));
            }
            temp=temp+Integer.toString(sum);
            }
            sb=new StringBuilder(temp);
        } 
        return sb.toString();
    }
}