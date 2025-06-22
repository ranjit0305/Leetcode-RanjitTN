class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<Character> arr = new ArrayList<>();
        List<String> res = new ArrayList<>();

        // Add all characters to a list (you had a contains check, which is not needed)
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
        }

        int cnt = 0;

        for (int j = 0; j < arr.size(); j += k) {
            String temp = "";
            while (cnt < k) {
                if (j + cnt < arr.size()) {
                    temp += arr.get(j + cnt);
                } else {
                    temp += fill;
                }
                cnt++;
            }
            cnt = 0;
            res.add(temp);
        }

        return res.toArray(new String[0]);
    }
}
