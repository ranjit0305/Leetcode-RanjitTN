class Solution {
    public String addSpaces(String s, int[] spaces) 
    {
    StringBuilder str1= new StringBuilder(s);
    for(int i=0;i<spaces.length;i++)
    {
        str1.insert(spaces[i]+i," ");
    }    
    s=str1.toString();
    return s;
    }
}