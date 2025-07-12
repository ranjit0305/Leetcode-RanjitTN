class Solution {
    public void helper(List<List<Integer>> mainlist,List<Integer> list,int nums[],int index)
    {
        //Base cond:
        if(index==nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            list.add(nums[i]);
            helper(mainlist,list,nums,i+1);
            mainlist.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainlist = new ArrayList<>();
        mainlist.add(new ArrayList<>());
        // Arrays.sort(nums);
        helper(mainlist,new ArrayList<>(),nums,0);
        return mainlist;
    }
}