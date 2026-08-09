class Solution(object):
    def findMissingElements(self, nums):
        s = set(nums)

        smallest = min(nums)
        largest = max(nums)

        missing = []

        for i in range(smallest + 1, largest):
            if i not in s:
                missing.append(i)

        return missing