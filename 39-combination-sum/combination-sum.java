class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> combin = new ArrayList<>();
         getAllCombinations(candidates,target,0,combin,ans);
    return ans;                 
    }
    void getAllCombinations(int[] candidates,int target,int idx,List<Integer> combin,List<List<Integer>> ans){
       if(idx==candidates.length || target<0)
           return;
        else if(target==0) {
            ans.add(new ArrayList<>(combin));
             return;
        }
      combin.add(candidates[idx]);
      getAllCombinations(candidates,target-candidates[idx],idx,combin,ans);
      combin.remove(combin.size()-1);
      getAllCombinations(candidates,target,idx+1,combin,ans);
    }
}