class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        ans.append(s.charAt(0)); // Add the first character to the result
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1; // Reset count if the current character is different
            }
            if (count < 3) {
                ans.append(s.charAt(i)); // Append character only if count is less than 3
            }
        }
        
        return ans.toString();
    }
}