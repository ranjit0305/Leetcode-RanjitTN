class Solution {
    public boolean canBeValid(String s, String locked) {
        if (locked.length() % 2 != 0) {
            return false; // Odd-length strings cannot be valid
        }

        int n = locked.length();
        int openCount = 0;

        // First pass: Left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                openCount++; // Increment for '(' or unlocked positions
            } else {
                openCount--; // Decrement for ')'
            }
            if (openCount < 0) {
                return false; // Invalid if unmatched ')' exceeds possible '('
            }
        }

        int closeCount = 0;

        // Second pass: Right to left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                closeCount++; // Increment for ')' or unlocked positions
            } else {
                closeCount--; // Decrement for '('
            }
            if (closeCount < 0) {
                return false; // Invalid if unmatched '(' exceeds possible ')'
            }
        }

        return true; // Valid if both passes succeed
    }
}
