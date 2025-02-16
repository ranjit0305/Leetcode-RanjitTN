class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        int lo = 0;
        int hi = words.length-1;
        while(lo<=hi){
            String temp = words[lo];
            words[lo] = words[hi];
            words[hi] = temp;
            lo++;
            hi--;
        }
        StringBuilder ans = new StringBuilder("");
        for(String word : words){
            if(!word.isEmpty()){
                ans.append(word);
                ans.append(" ");
            }
        }
        return ans.toString().trim();
    }
}