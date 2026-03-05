class Solution {
    public int minOperations(String s) 
    {
        int startWithZero = 0;
        int startWithOne = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char expected0;
            char expected1;

            if(i % 2 == 0)
            {
                expected0 = '0';
                expected1 = '1';
            }
            else
            {
                expected0 = '1';
                expected1 = '0';
            }

            if(s.charAt(i) != expected0)
            {
                startWithZero++;
            }

            if(s.charAt(i) != expected1)
            {
                startWithOne++;
            }
        }

        if(startWithZero < startWithOne)
        {
            return startWithZero;
        }
            return startWithOne;
    }
}