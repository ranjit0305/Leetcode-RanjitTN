class Solution(object):
    def countTriples(self, n):
        squares = {x*x for x in range(1,n+1)}
        cnt = 0
        for i in range(1, n+1):
            for j in range(1, n+1):
                if i*i + j*j in squares:
                    cnt += 1
        return cnt
