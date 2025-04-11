class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for (int i = low; i <= high; i++) {
            int tempsum1 = 0;
            int tempsum2 = 0;
            String str = Integer.toString(i);

            if (str.length() % 2 == 1) {
                continue;
            }

            int half = str.length() / 2;
            for (int k = 0; k < half; k++) {
                int tempnum = str.charAt(k) - '0';
                tempsum1 += tempnum;
            }
            for (int j = half; j < str.length(); j++) {
                int tempnum = str.charAt(j) - '0';
                tempsum2 += tempnum;
            }

            if (tempsum1 == tempsum2) {
                cnt++;
            }
        }
        return cnt;
    }
}
