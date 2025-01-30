class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Temporary array to hold the merged elements
        int[] merge_array = new int[m + n];

        // Copy elements from nums1 to merge_array
        for (int i = 0; i < m; i++) {
            merge_array[i] = nums1[i];
        }

        // Copy elements from nums2 to merge_array
        for (int j = 0; j < n; j++) {
            merge_array[m + j] = nums2[j];
        }

        // Sort the merge_array using bubble sort
        for (int i = 0; i < merge_array.length - 1; i++) {
            for (int j = 0; j < merge_array.length - 1 - i; j++) {
                if (merge_array[j] > merge_array[j + 1]) {
                    // Swap merge_array[j] and merge_array[j + 1]
                    int temp = merge_array[j];
                    merge_array[j] = merge_array[j + 1];
                    merge_array[j + 1] = temp;
                }
            }
        }

        // Copy sorted elements back to nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = merge_array[k];
        }
    }
}
