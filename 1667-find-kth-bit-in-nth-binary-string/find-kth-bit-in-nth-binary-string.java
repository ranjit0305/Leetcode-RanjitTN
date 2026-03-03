class Solution {
    public char findKthBit(int n, int k) 
    {
        StringBuilder temp = new StringBuilder("0");   

        for(int i = 1; i < n; i++)
        {
            StringBuilder copy = new StringBuilder(temp);
            temp.append("1");
            temp.append(invert(copy).reverse());

            if(temp.length() >= k)
                break;
        }

        return temp.charAt(k-1);
    }

    public StringBuilder invert(StringBuilder temp)
    {
        for(int i = 0; i < temp.length(); i++)
        {
            if(temp.charAt(i) == '0')
                temp.setCharAt(i, '1');
            else
                temp.setCharAt(i, '0');
        }
        return temp;
    }
}