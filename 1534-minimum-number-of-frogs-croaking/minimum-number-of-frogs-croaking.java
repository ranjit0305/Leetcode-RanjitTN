class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        
        int[] count = new int[5]; // c,r,o,a,k
        int frogs = 0;
        int maxFrogs = 0;
        
        for(char ch : croakOfFrogs.toCharArray()) {
            
            if(ch == 'c') {
                count[0]++;
                frogs++;
                maxFrogs = Math.max(maxFrogs, frogs);
            }
            else if(ch == 'r') {
                if(count[0] == 0) return -1;
                count[0]--;
                count[1]++;
            }
            else if(ch == 'o') {
                if(count[1] == 0) return -1;
                count[1]--;
                count[2]++;
            }
            else if(ch == 'a') {
                if(count[2] == 0) return -1;
                count[2]--;
                count[3]++;
            }
            else if(ch == 'k') {
                if(count[3] == 0) return -1;
                count[3]--;
                frogs--;  // frog finished croak
            }
        }
        
        if(frogs != 0) return -1;
        
        return maxFrogs;
    }
}