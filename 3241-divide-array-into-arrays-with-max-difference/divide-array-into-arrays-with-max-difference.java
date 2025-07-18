class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] arr=new int[nums.length/3][3];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+3)
        {
            if(nums[i+2]-nums[i]>k)
            {
                return new int[0][];
            }
            arr[i/3][0]=nums[i];
            arr[i/3][1]=nums[i+1];
            arr[i/3][2]=nums[i+2];
        }
        return arr;
    }
}