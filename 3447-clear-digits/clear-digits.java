class Solution {
    public String clearDigits(String s) 
    {
    StringBuilder sb=new StringBuilder(s);
    int i=0;
    while(i<sb.length())
    {
        if(sb.length()==0)
        {
            return "";
        }
        if(sb.charAt(i)<'a')
        {
            sb.delete(i-1,i+1);
            i=0;
        }
        i++;
    }    
    return sb.toString();
    }
}