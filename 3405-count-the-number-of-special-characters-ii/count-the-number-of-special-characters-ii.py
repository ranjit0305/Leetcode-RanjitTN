class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        cnt = 0

        for ch in "abcdefghijklmnopqrstuvwxyz":
            if ch in word and ch.upper() in word:
                
                last_lower = word.rfind(ch)
                first_upper = word.find(ch.upper())

                if last_lower < first_upper:
                    cnt += 1

        return cnt