class Solution {
    public int maximumLength(String s) {
        int n=s.length();
        int cnt=0;

        Set<Character> set=new HashSet();
        for(char chr:s.toCharArray()){
            set.add(chr);
        }

        int longSubstr=-1;
        for(Character ch:set){ //each character
            for(int l=1; l<=n; l++){ //substring length
                String subStr=String.valueOf(ch).repeat(l);
                if(!s.contains(subStr)) break;

                int count=matchCount(s, subStr);                    
                if(count>=3){
                    longSubstr=Math.max(longSubstr, subStr.length());
                }
        
            }
        }        
        return longSubstr;
    }

    int matchCount(String s, String t){
        int lastIndex = 0;
        int count = 0;

        lastIndex = s.indexOf(t, lastIndex);
        while (lastIndex != -1) {
            count++;
            lastIndex += 1;
            lastIndex = s.indexOf(t, lastIndex);
        }
        return count;
    }


}