class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int maxLength = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < maxLength; i++) {
            int temp1 = 0;
            int temp2 = 0;
            if (i < arr1.length) {
                temp1 = Integer.parseInt(arr1[i]);
            }
            if (i < arr2.length) {
                temp2 = Integer.parseInt(arr2[i]);
            }
            if (temp1 > temp2) {
                return 1;
            }
            if (temp1 < temp2) {
                return -1;
            }
        }
        return 0;
    }
}
