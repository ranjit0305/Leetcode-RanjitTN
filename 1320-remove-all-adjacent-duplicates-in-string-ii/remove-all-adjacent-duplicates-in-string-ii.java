class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> st = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()[0] == ch)
            {
                st.peek()[1]++;

                if(st.peek()[1] == k)
                {
                    st.pop();
                }
            }
            else
            {
                st.push(new int[]{ch,1});
            }
        }

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty())
        {
            int[] cur = st.pop();
            char c = (char)cur[0];
            int count = cur[1];

            for(int i=0;i<count;i++)
                res.append(c);
        }

        return res.reverse().toString();
    }
}