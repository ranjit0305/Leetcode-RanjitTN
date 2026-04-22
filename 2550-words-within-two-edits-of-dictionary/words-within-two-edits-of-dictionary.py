class Solution:
    def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
        def distance(s1,s2):
            cnt=0
            for i in range(0,len(s1)):
                if s1[i]!=s2[i]:
                    cnt=cnt+1
                if cnt==3:
                    return False
            return True
        res=[]
        for q in queries:
            for d in dictionary:
                if distance(q,d)==True:
                    res.append(q)
                    break;
        return res
            