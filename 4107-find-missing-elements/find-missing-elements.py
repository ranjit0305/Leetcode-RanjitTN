class Solution(object):
    def findMissingElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res=[]
        nums.sort()
        lar=nums[len(nums)-1]
        small=nums[0]
        for i in range(small,lar):
            if i not in nums:
                res.append(i)
        return res
        