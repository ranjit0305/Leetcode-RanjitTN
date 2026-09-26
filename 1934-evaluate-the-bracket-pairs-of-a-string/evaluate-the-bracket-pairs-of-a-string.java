class Solution {
    public String evaluate(String s, List<List<String>> knowledge) 
    {
        HashMap<String, String> map = new HashMap<>();

        for(int j = 0; j < knowledge.size(); j++)
        {
            map.put(knowledge.get(j).get(0), knowledge.get(j).get(1));
        }

        int i = 0;
        String res = "";

        while(i < s.length())
        {
            if(s.charAt(i) != '(')
            {
                res = res + s.charAt(i);
                i++;
            }
            else
            {
                String temp = "";
                i++;

                while(s.charAt(i) != ')')
                {
                    temp = temp + s.charAt(i);
                    i++;
                }

                if(map.containsKey(temp))
                {
                    res = res + map.get(temp);
                }
                else
                {
                    res = res + "?";
                }

                i++;
            }
        }

        return res;
    }
}