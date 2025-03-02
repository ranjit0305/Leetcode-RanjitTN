class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> temp=new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i][0]==nums2[j][0])
            {
                temp.add(new int[]{nums1[i][0], nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0])
            {
                temp.add(nums1[i]);
                i++;
            }
            else
            {
                temp.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length)
        {
            temp.add(nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {temp.add(nums2[j]);
            j++;
        }
        return temp.toArray(new int[temp.size()][]);
    }
}