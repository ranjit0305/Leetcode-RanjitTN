class Solution(object):
    def constructTransformedArray(self, nums):
        n = len(nums)
        result = [0] * n
        
        for i in range(n):
            new_index = (i + nums[i]) % n
            result[i] = nums[new_index]
        
        return result
