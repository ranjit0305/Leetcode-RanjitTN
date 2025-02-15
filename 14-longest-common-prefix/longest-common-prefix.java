class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder("");
        if (strs == null || strs.length == 0) {
            return ans.toString();
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { 
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return ans.toString();
                }
            }
            ans.append(c);
        }

        return ans.toString();
    }
}
