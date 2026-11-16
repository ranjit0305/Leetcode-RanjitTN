class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(nums,ans,0,temp);    
        return ans;
    }
    public void helper(int[] nums,List<List<Integer>> ans,int index,List<Integer> temp)
    {
        if(index==nums.length) 
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        helper(nums,ans,index+1,temp);
        temp.remove(temp.size() - 1);
        helper(nums,ans,index+1,temp);
    }
}