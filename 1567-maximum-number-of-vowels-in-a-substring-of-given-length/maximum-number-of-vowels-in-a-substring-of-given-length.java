class Solution {
    public int maxVowels(String s, int k) {
        int[] vowels = new int['z' + 1];
        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;

        char[] chars = s.toCharArray();
        int r = 0, max = 0;
        while(r < k){
            max += vowels[chars[r++]];
        }

        int l = 0, n = max;
        while(r < chars.length){
            n = n - vowels[chars[l++]] + vowels[chars[r++]];

            if (n > max) max = n;
        }

        return max;
    }
}