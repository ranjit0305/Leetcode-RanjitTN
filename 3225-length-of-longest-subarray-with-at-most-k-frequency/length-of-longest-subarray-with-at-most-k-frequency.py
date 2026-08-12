class Solution(object):
    def maxSubarrayLength(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        mp={}
        l=0
        r=0
        maxlen=0
        while r<len(nums):
            mp[nums[r]]=mp.get(nums[r],0)+1
            while mp[nums[r]]>k:
                mp[nums[l]]-=1
                if mp[nums[l]]==0:
                    del mp[nums[l]]
                l+=1
            maxlen=max(maxlen,r-l+1)
            r+=1
        return maxlen
        