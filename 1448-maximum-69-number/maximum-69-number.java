class Solution {
    public int maximum69Number (int num) 
    {
        int max=num;
        String temp=Integer.toString(num);
        StringBuilder sb=new StringBuilder(temp);
        for(int i=0;i<temp.length();i++)
        {
            if(sb.charAt(i)=='6')
            {
                sb.setCharAt(i,'9');
                max=Math.max(max,Integer.parseInt(sb.toString()));
                sb.setCharAt(i,'6');
            }
        }
        return max;
    }
}