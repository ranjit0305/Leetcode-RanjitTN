class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for(int i = 0; i < chars.length; ){
            char currChar = chars[i];
            int countFreq = 0;
            while(i < chars.length && chars[i] == currChar){
                countFreq++;
                i++;
            }
            chars[index++] = currChar;
            if(countFreq > 1){
                String temp = "" + countFreq;
                for(int j = 0; j < temp.length(); j++){
                    chars[index++] = temp.charAt(j);
                }
            }
        }
        return index;
    }
}