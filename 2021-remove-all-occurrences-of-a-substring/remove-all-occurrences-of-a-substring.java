class Solution {
    public String removeOccurrences(String s, String part) 
    {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>=part.length())
        {
            int index=sb.indexOf(part);
            if(index==-1||part.length()>sb.length())
            {
                return sb.toString();
            }
            sb.delete(index,index+part.length());
        }
        return sb.toString();
    }
}