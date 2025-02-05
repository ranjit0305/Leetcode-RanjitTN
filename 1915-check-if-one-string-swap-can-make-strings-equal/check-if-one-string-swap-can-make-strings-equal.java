class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt = 0;
        int first = -1, second = -1; // To store indices of mismatches

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
                if (cnt == 1) {
                    first = i;
                } else if (cnt == 2) {
                    second = i;
                } else {
                    return false; // More than two mismatches
                }
            }
        }

        if (cnt == 0) {
            return true; // Strings are already equal
        }

        if (cnt == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first)) {
            return true; // Swap is possible
        }

        return false;
    }
}
