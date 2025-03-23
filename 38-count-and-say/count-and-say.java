class Solution {
    public String countAndSay(int n) {
        String s = "1";
        int i = 2;
        while(i <= n){
            StringBuilder sb = new StringBuilder();
            int ct = 0;
            char ch1 = s.charAt(0);
            for(int j=0; j<s.length(); j++){
                char ch2 = s.charAt(j);
                if(ch1 == ch2) ct++;
                else{
                    sb.append(ct);
                    sb.append(ch1);
                    ct = 1;
                    ch1 = ch2;
                }
            }
            sb.append(ct);
            sb.append(ch1);
            i++;
            s = sb.toString();
        }
        return s;
    }
}