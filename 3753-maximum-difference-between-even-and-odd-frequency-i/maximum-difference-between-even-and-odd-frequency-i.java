import java.util.Arrays;

class Solution {
    public int maxDifference(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0;
        int maxDiff = Integer.MIN_VALUE;
        int[] oddFreqs = new int[26];
        int[] evenFreqs = new int[26];
        int oddCount = 0, evenCount = 0;
        while (i < arr.length) {
            int cnt = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                cnt++;
                i++;
            }
            if (cnt % 2 == 0) {
                evenFreqs[evenCount++] = cnt;
            } else {
                oddFreqs[oddCount++] = cnt;
            }
            i++;
        }
        if (oddCount == 0 || evenCount == 0) return -1;
        for (int x = 0; x < oddCount; x++) {
            for (int y = 0; y < evenCount; y++) {
                maxDiff = Math.max(maxDiff, oddFreqs[x] - evenFreqs[y]);
            }
        }
        return maxDiff;
    }
}
