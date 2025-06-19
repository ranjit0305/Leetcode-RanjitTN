class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s=new StringBuilder(word);
        Stack<Character> st=new Stack<>();
        if(word.indexOf(ch)==-1)
        {
            return word;
        }
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                st.push(word.charAt(i));
                break;
            }
            else
            {
                st.push(word.charAt(i));
            }
        }
        int x=st.size();
        for(int i=0;i<x;i++)
        {
            s.setCharAt(i, st.pop());
        }
        return s.toString();
    }
}