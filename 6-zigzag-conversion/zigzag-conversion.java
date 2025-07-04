class Solution {
    public String convert(String s, int numRows) 
    {
        List<List<Character>> temp=new ArrayList<>();
        if(numRows==1)
        {
            return s;
        }
        for(int l=0;l<numRows;l++)
        {
            temp.add(new ArrayList<>());
        }
        int i=0;
        int n=s.length();
        String res="";
        boolean down=true;
        int j=0;
        while(i<n)
        { 
            if(down==true)
            {
                while(i<n && j<numRows)
                {
                    temp.get(j).add(s.charAt(i));
                    i++;
                    j++;
                }
                down=false;
            }
            if(down==false)
            {
                j=numRows-2;
                while(i<n && j>=0)
                {
                    temp.get(j).add(s.charAt(i));
                    i++;
                    j--;
                }
                j=1;
                down=true;
            }
        }    
        for(int k=0;k<numRows;k++)
        {
            for(int m=0;m<temp.get(k).size();m++)
            {
                res=res+temp.get(k).get(m);
            }
        }
        return res;
    }
}