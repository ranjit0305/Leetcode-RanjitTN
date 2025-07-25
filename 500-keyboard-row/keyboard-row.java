class Solution {
    public String[] findWords(String[] words) {
        List<String> temp = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("qwertyuiop", 0);
        map.put("asdfghjkl", 1);
        map.put("zxcvbnm", 2);

        for (int i = 0; i < words.length; i++) {
            String t = words[i];
            int[] arr = new int[3];
            for (int j = 0; j < t.length(); j++) {
                char c = t.charAt(j);
                for (String search : map.keySet()) {
                    String ch = String.valueOf(Character.toLowerCase(c));
                    if (search.contains(ch)) {
                        arr[map.get(search)]++;
                    }
                }
            }
            for (int k = 0; k < 3; k++) {
                if (arr[k] == t.length()) {
                    temp.add(t);
                }
            }
        }
        String[] res = temp.toArray(new String[temp.size()]);
        return res;
    }
}
