class Solution {
    public int addDigits(int num) 
    {
        StringBuilder temp=new StringBuilder(Integer.toString(num));
        while(temp.length()>1)
        {
            int sum=0;
            for(int i=0;i<temp.length();i++)
            {
                sum=sum+(Integer.parseInt(String.valueOf(temp.charAt(i))));
            }
            temp=new StringBuilder(Integer.toString(sum));
        }
        return Integer.parseInt(temp.toString());
    }
}