import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        
        // Convert array to string
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }

        // Use BigInteger to handle large numbers
        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        // Convert number back to array
        String resultStr = num.toString();
        int[] res = new int[resultStr.length()];
        
        for (int i = 0; i < resultStr.length(); i++) {
            res[i] = resultStr.charAt(i) - '0';
        }

        return res;
    }
}
