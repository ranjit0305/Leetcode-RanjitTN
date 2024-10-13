class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;  // Pointer for string s
        int j = 0;  // Pointer for string t

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // Move to the next character in s if a match is found
            }
            j++;  // Always move to the next character in t
        }

        // If i has traversed all characters in s, it's a subsequence
        return i == s.length();
    }
}
