class Solution(object):

    def digitproduct(self, x):
        prod = 1
        while x > 0:
            prod = prod * (x % 10)
            x = x // 10
        return prod

    def smallestNumber(self, n, t):
        """
        :type n: int
        :type t: int
        :rtype: int
        """
        check = 0
        while check == 0:
            r = self.digitproduct(n)
            if r % t == 0:
                check = 1
            else:
                n = n + 1
        return n