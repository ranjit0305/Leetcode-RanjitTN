class Solution {
    public int minMaxDifference(int num) {
        String number = Integer.toString(num);
        char[] arr = number.toCharArray();
        String max = "";
        String min = "";
        char firstNonNine = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '9') {
                firstNonNine = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstNonNine) {
                max += '9';
            } else {
                max += arr[i];
            }
        }
        char firstDigit = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstDigit) {
                min += '0';
            } else {
                min += arr[i];
            }
        }
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}
