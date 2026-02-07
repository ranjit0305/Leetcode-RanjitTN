class Solution {
    public int minimumDeletions(String s) {
        int deletions = 0;
        int bCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else if (c == 'a') {
                if (bCount > 0) {
                    deletions++;
                    bCount--;
                }
            }
        }
        
        return deletions;
    }
}