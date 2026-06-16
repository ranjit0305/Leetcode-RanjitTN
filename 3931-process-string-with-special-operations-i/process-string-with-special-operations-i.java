class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t=='*')
            {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else if(t=='#')
            {
                sb.append(sb);
            }
            else if(t=='%')
            {
                sb.reverse();
            }
            else
            {
                sb.append(t);
            }
        }
        return sb.toString();
    }
}