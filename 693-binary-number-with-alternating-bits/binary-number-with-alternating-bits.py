class Solution(object):
    def hasAlternatingBits(self, n):
        """
        :type n: int
        :rtype: bool
        """
        binary_string=bin(n)
        for i in range(0,(len(binary_string)-1)):
            if binary_string[i]==binary_string[i+1]:
                return False
        return True

        