import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String temp = paragraph.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        String curr = "";
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (Character.isLetter(ch)) {
                curr = curr + ch;
            } else {
                if (!curr.equals("")) {
                    map.put(curr, map.getOrDefault(curr, 0) + 1);
                    curr = "";
                }
            }
        }
        if (!curr.equals("")) {
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        List<String> store = new ArrayList<>();
        for (int i = 0; i < banned.length; i++) {
            store.add(banned[i].toLowerCase());
        }
        int max = 0;
        String result = "";
        for (String key : map.keySet()) {
            if (!store.contains(key) && map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        return result;
    }
}
