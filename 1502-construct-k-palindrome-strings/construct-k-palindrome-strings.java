class Solution {
    public boolean canConstruct(String s, int k) 
    {
        if (s.length() < k) return false;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int oddCount = 0;   
        for(int i=0;i<chars.length;)
        {
            int cnt=0;
            char current=chars[i];
            while(i<chars.length && chars[i]==current)
            {
                cnt++;
                i++;
            }
            if(cnt%2!=0)
            {
                oddCount++;
            }
        }
        return oddCount <= k;
    }
}