class Solution {
    public boolean doesAliceWin(String s) 
    {
        int con=0;
        int vow=0;
        int lastvow=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vow++;
                lastvow=i;
            }
            else
            {
                con++;
            }
        }   
        if(vow==0)
        {
            return false;
        }
        if(vow%2==1)
        {
            return true;
        }
        else{
            vow=1;
            con=s.length()-lastvow-1;
            return true;
        }
    }
}