class Solution {
    public boolean isPalindrome(int x) {
        String res = Integer.toString(x);
        String reversed = new StringBuilder(res).reverse().toString();
        return res.equals(reversed);
    }
}
