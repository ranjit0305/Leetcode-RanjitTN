class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1]; // Size should be n + 1
        for (int k = 0; k <= n; k++) { // Loop from 0 to n
            String str = Integer.toBinaryString(k);
            int cnt = 0; // Initialize count for the current number
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    cnt++; // Increment count for each '1'
                }
            }
            arr[k] = cnt; // Store the count in the array
        }
        return arr;
    }
}
