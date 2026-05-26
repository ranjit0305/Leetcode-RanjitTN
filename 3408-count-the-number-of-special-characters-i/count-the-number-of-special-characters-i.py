class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        cnt = 0
        
        for ch in "abcdefghijklmnopqrstuvwxyz":
            if ch in word and ch.upper() in word:
                cnt += 1
                
        return cnt