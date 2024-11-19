class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        long ans = Long.MIN_VALUE;
        long sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(j<n){
            if(hs.contains(nums[j]) && i<n){
                sum-=nums[i];
                hs.remove(nums[i]);
                i++;
            }else{
                if(j-i+1==k){
                    sum+=nums[j];
                    hs.add(nums[j]);
                    j++;
                    ans = Math.max(ans,sum);
                }else if(j-i+1<k){
                    sum+=nums[j];
                    hs.add(nums[j]);
                    j++;
                }else if(j-i+1>k){
                    sum-=nums[i];
                    hs.remove(nums[i]);
                    i++;
                }
            }
            System.out.println(i+" "+j);
        }
        System.out.println(ans);
        return (ans>0?ans:0);
    }
}