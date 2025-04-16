class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return canBreak(s, wordDict, new HashMap<>());
    }

    private boolean canBreak(String s, List<String> wordDict, Map<String, Boolean> memo) {
        // Memoization to avoid recomputation
        if (memo.containsKey(s)) return memo.get(s);
        // If the string is empty, we've successfully broken it down
        if (s.length() == 0) return true;
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String remaining = s.substring(word.length());
                if (canBreak(remaining, wordDict, memo)) {
                    memo.put(s, true);
                    return true;
                }
            }
        }
        memo.put(s, false);
        return false;
    }
}
