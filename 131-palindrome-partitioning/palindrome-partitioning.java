class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        helper(res,temp,0,s);
        return res; 
    }
    public boolean isPalindrome(String t,int l,int r)
    {
        while(l<r)
        {
            if(t.charAt(l)!=t.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public void helper(List<List<String>> res,List<String> temp,int idx,String s)
    {
            if (idx == s.length()) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i < s.length(); i++) {

            if (isPalindrome(s, idx, i)) {

                temp.add(s.substring(idx, i + 1));

                helper(res,temp,i+1,s);

                temp.remove(temp.size() - 1);
            }
        }

        
    }
}