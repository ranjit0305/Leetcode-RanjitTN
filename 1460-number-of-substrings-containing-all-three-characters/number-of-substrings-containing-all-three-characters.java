import java.util.*;

class Solution {
    public int numberOfSubstrings(String s) {
        int cnt = 0;
        int left = 0;
        Map<Character, Integer> check = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            // Add character to frequency map
            check.put(s.charAt(right), check.getOrDefault(s.charAt(right), 0) + 1);
            while (check.size() == 3) {
                cnt += s.length() - right;
                char leftChar = s.charAt(left);
                check.put(leftChar, check.get(leftChar) - 1);
                if (check.get(leftChar) == 0) {
                    check.remove(leftChar);
                }
                left++;
            }
        }
        return cnt;
    }
}
