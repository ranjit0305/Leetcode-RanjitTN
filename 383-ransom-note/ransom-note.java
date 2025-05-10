class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> megaHash = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            megaHash.put(c, megaHash.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!megaHash.containsKey(c) || megaHash.get(c) <= 0) {
                return false;
            }
            megaHash.put(c, megaHash.get(c) - 1);
        }
        return true;
    }
}