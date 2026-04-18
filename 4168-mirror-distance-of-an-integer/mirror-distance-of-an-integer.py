class Solution(object):
    def mirrorDistance(self, n):
        """
        :type n: int
        :rtype: int
        """
        rev=0
        num=n
        while(num!=0):
            rem=num%10
            rev=rev*10+rem
            num=num/10
        
        return abs(rev-n);        