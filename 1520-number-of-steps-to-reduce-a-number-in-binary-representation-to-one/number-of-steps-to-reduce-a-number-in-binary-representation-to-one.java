class Solution {
    public int numSteps(String s) 
    {
        int cnt = 0;
        StringBuilder sb = new StringBuilder(s);
        
        while(!sb.toString().equals("1"))
        {
            cnt++;
            // If last bit is 0 → even → divide by 2
            if(sb.charAt(sb.length()-1) == '0')
            {
                sb.deleteCharAt(sb.length()-1); // divide by 2
            }
            else
            {
                // odd → add 1 (binary addition)
                int i = sb.length()-1;
                while(i >= 0 && sb.charAt(i) == '1')
                {
                    sb.setCharAt(i, '0');
                    i--;
                }
                if(i >= 0)
                {
                    sb.setCharAt(i, '1');
                }
                else
                {
                    sb.insert(0, '1');
                }
            }
        }
        return cnt;
    }
}