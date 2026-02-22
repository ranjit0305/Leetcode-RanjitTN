class Solution {
    public String getHint(String secret, String guess) 
    {
        int bulls=0;
        int cows=0;
        HashMap<Character,Integer> sec = new HashMap<>();
        HashMap<Character,Integer> gue = new HashMap<>();
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                bulls++;
            }
            else
            {
                sec.put(secret.charAt(i),sec.getOrDefault(secret.charAt(i),0)+1);
                gue.put(guess.charAt(i),gue.getOrDefault(guess.charAt(i),0)+1);
            }
        }    
        for(char c : sec.keySet())
        { 
            if(gue.containsKey(c))
            {
                cows += Math.min(sec.get(c),gue.get(c));
            }
        }
        return bulls + "A" + cows + "B";
    }
}