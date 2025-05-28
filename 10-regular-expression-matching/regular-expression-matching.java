class Solution {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }

        if (p.length() > 1 && p.charAt(1) == '*') {
            // Case 1: Remove char and '*' in pattern
            if (isMatch(s, p.substring(2))) {
                return true;
            }
            // Case 2: Use '*' to match one or more characters
            if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
                return isMatch(s.substring(1), p);
            }
            return false;
        } else {
            // No '*', check current char and move forward
            if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
                return isMatch(s.substring(1), p.substring(1));
            }
        }

        return false;
    }
}
