class Solution(object):
    def maxDistance(self, colors):
        """
        :type colors: List[int]
        :rtype: int
        """
        maxdist=0;
        for i in range(0,len(colors)):
            for j in range(i+1,len(colors)):
                if(colors[i]!=colors[j]):
                    maxdist=max(maxdist,abs(i-j))
        return maxdist
        