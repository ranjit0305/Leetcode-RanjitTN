class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        sum1=0
        for i in nums:
            sum1=sum1+i
        return sum1%k
        

        