class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] && !temp.contains(nums1[i]))
                {
                    temp.add(nums1[i]);
                    break;
                }
            }
        }    
        int[] res=new int[temp.size()];
        int j=0;
        for(int i:temp)
        {
            res[j]=i;
            j++;
        }
        return res;
    }
}