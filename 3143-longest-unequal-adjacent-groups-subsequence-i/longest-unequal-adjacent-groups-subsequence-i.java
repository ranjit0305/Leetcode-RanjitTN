class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            List<String> temp = new ArrayList<>();
            temp.add(words[i]);
            int lastGroup = groups[i];
            
            for (int j = i + 1; j < words.length; j++) {
                if (groups[j] != lastGroup) {
                    temp.add(words[j]);
                    lastGroup = groups[j];
                }
            }
            
            if (temp.size() > res.size()) {
                res = temp;
            }
        }
        
        return res;
    }
}
