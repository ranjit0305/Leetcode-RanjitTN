class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0; // Pointer for str2
        
        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            char ch = str1.charAt(i);
            char nextChar = (char) ((ch - 'a' + 1) % 26 + 'a'); // Calculate the next character cyclically
            
            // Check if current character matches or can be incremented to match
            if (ch == str2.charAt(j) || nextChar == str2.charAt(j)) {
                j++; // Move to the next character in str2
            }
        }
        
        // If we matched all characters in str2, return true
        return j == str2.length();
    }
}
