class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> temp=new Stack<>();
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                temp.push('(');
            }
            if(s.charAt(i)==')')
            {
                if(!temp.isEmpty())
                {
                    temp.pop();
                }
                else
                {
                    cnt++;
                }
            }
        
        }
        return cnt+temp.size();
    }
}