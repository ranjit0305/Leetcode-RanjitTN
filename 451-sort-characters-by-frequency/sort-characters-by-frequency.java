class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        int max = s.length();
        for (int i = max; i > 0; i--) {
            for (Character k : freq.keySet()) {
                if (freq.get(k) == i) {
                    for (int l = 0; l < i; l++) {
                        res.append(k);
                    }
                }
            }
        }

        return res.toString();
    }
}
