
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] dict = new String[10];

        dict[2] = "abc";
        dict[3] = "def";
        dict[4] = "ghi";
        dict[5] = "jkl";
        dict[6] = "mno";
        dict[7] = "pqrs";
        dict[8] = "tuv";
        dict[9] = "wxyz";

        List<String> temp = new ArrayList<>();

        helper(digits, dict, temp, 0, "");

        return temp;
    }

    public void helper(String digits, String[] dict,
                       List<String> temp, int index, String s) {

        if (s.length() == digits.length()) {
            temp.add(s);
            return;
        }

        int digit = digits.charAt(index) - '0';

        for (int i = 0; i < dict[digit].length(); i++) {
            helper(digits, dict, temp, index + 1,s + dict[digit].charAt(i));
        }
    }
}
