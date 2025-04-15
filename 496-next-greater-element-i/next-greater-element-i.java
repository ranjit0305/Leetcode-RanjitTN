class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int k = j + 1;
                    while (k < nums2.length && nums2[k] <= nums2[j]) 
                    {
                        k++;
                    }
                    if (k >= nums2.length) 
                    {
                        ans[i] = -1;
                    } 
                    else 
                    {
                        ans[i] = nums2[k];
                    }
                    found = true;
                    break;
                }
            }
        }
        return ans;
    }
}
