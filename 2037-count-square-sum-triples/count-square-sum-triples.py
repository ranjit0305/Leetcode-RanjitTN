class Solution(object):
    def countTriples(self, n):
        """
        :type n: int
        :rtype: int
        """
        cnt=0
        for i in range(1,n+1):
            for j in range(i+1,n+1):
                for k in range(j+1,n+1):
                    if i*i + j*j == k*k:
                        cnt=cnt+2
        return cnt

    
        