class Solution {
    public String sortVowels(String s) 
    {
        List<Character> vowels=new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
            vowels.add(s.charAt(i));
            }
        }    
        Collections.sort(vowels);
        String temp="";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                temp=temp+vowels.get(j);
                j++;
            }
            else
            {
                temp=temp+ch;
            }
        }   
        return temp;
    }
     public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}