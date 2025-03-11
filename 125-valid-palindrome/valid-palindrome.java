class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        int left = 0;
        char[] arr = s.toCharArray();
        int right = arr.length - 1;
        while (left <= right) {
            if (!isAlphanumeric((int) s.charAt(left))) {
                left++;
                continue;
            }
            if (!isAlphanumeric((int) s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    boolean isAlphanumeric(int codePoint) {
        return (codePoint >= 65 && codePoint <= 90) ||
               (codePoint >= 97 && codePoint <= 122) ||
               (codePoint >= 48 && codePoint <= 57);
    }
}
