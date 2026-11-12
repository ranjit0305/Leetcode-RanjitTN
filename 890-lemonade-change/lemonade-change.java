class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int cnt_five=0;
        int cnt_ten=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                cnt_five++;
            }
            if(bills[i]==10)
            {
                cnt_ten++;
                if(cnt_five==0) return false;
                cnt_five--;
            }
            if(bills[i]==20)
            {
                if(cnt_five==0) return false;
                if(cnt_ten==0)
                {
                    if(cnt_five<3) return false;
                    cnt_five=cnt_five-3;
                }
                else
                {
                cnt_five--;
                cnt_ten--;
                }
            }
        }    
        return true;
    }
}