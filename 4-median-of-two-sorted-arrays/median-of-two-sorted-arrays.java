import java.util.ArrayList;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> arr = new ArrayList<>();

        // Merging the two sorted arrays into one
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                arr.add(nums1[i]);
                i++;
            } else {
                arr.add(nums2[j]);
                j++;
            }
        }

        // Adding remaining elements from nums1
        while (i < nums1.length) {
            arr.add(nums1[i]);
            i++;
        }

        // Adding remaining elements from nums2
        while (j < nums2.length) {
            arr.add(nums2[j]);
            j++;
        }

        int s = arr.size();
        if (s % 2 == 0) {
            // Median for even-sized array
            return (arr.get(s / 2 - 1) + arr.get(s / 2)) / 2.0;
        } else {
            // Median for odd-sized array
            return arr.get(s / 2);
        }
    }
}
