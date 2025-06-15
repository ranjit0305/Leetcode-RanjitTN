class Solution {
    public int maxDiff(int num) {
        String str = Integer.toString(num);
        char[] maxChars = str.toCharArray();
        char[] minChars = str.toCharArray();
        char replaceForMax = 0;
        for (char c : maxChars) {
            if (c != '9') {
                replaceForMax = c;
                break;
            }
        }
        if (replaceForMax != 0) {
            for (int i = 0; i < maxChars.length; i++) {
                if (maxChars[i] == replaceForMax) {
                    maxChars[i] = '9';
                }
            }
        }

        // ===== MIN logic =====
        char replaceForMin = 0;
        char replaceWithMin;

        if (minChars[0] != '1') {
            // If first digit isn't 1, replace it with 1 to avoid leading zero
            replaceForMin = minChars[0];
            replaceWithMin = '1';
        } else {
            // Replace some digit (≠ 0 and 1) with 0
            replaceWithMin = '0';
            for (int i = 1; i < minChars.length; i++) {
                if (minChars[i] != '0' && minChars[i] != '1') {
                    replaceForMin = minChars[i];
                    break;
                }
            }
        }
        if (replaceForMin != 0) {
            for (int i = 0; i < minChars.length; i++) {
                if (minChars[i] == replaceForMin) {
                    minChars[i] = replaceWithMin;
                }
            }
        }
        int maxVal = Integer.parseInt(new String(maxChars));
        int minVal = Integer.parseInt(new String(minChars));
        return maxVal - minVal;
    }
}
