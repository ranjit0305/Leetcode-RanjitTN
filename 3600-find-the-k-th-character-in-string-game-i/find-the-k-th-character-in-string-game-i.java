class Solution {
    public char kthCharacter(int k) 
    {
        String res="a";
        while(res.length()<=k)
        {
            String temp="";
            for(int i=0;i<res.length();i++)
            {
                char c=res.charAt(i);
                int temp1=c+1;
                c=(char)temp1;
                if(c=='z')
                {
                    c='a';
                }
                temp=temp+c;
            }
            res=res+temp;
        }
        return res.charAt(k-1);
    }
}   