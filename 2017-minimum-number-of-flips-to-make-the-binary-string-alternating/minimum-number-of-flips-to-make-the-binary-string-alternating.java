class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String ss = s + s;

        int flip1 = 0;
        int flip2 = 0;
        int res = Integer.MAX_VALUE;

        int left = 0;

        for (int right = 0; right < ss.length(); right++) {

            char expected1;
            char expected2;

            if (right % 2 == 0) {
                expected1 = '0';
                expected2 = '1';
            } 
            else {
                expected1 = '1';
                expected2 = '0';
            }

            if (ss.charAt(right) != expected1) {
                flip1++;
            }

            if (ss.charAt(right) != expected2) {
                flip2++;
            }

            if (right - left + 1 > n) {

                char leftExpected1;
                char leftExpected2;

                if (left % 2 == 0) {
                    leftExpected1 = '0';
                    leftExpected2 = '1';
                } 
                else {
                    leftExpected1 = '1';
                    leftExpected2 = '0';
                }

                if (ss.charAt(left) != leftExpected1) {
                    flip1--;
                }

                if (ss.charAt(left) != leftExpected2) {
                    flip2--;
                }

                left++;
            }

            if (right - left + 1 == n) {
                res = Math.min(res, Math.min(flip1, flip2));
            }
        }

        return res;
    }
}