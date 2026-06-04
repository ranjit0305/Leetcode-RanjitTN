class Solution {
    public int totalWaviness(int num1, int num2) 
    {
        int cnt=0;
        if(num2 < 100)
        {
            return 0;
        }    
        for(int i= num1;i<=num2;i++)
        {
            int ret=waviness(i);
            cnt=cnt+ret;
        }
        return cnt;
    }
    int waviness(int num)
    {
        int cnt=0;
        List<Integer> arr=new ArrayList<>();
        while(num>0)
        {
            int rem=num%10;
            arr.add(rem);
            num=num/10;
        }
        for(int i=1;i<arr.size()-1;i++)
        {
            if(arr.get(i)>arr.get(i+1) && arr.get(i)>arr.get(i-1))
            {
                cnt++;
            }
            else if(arr.get(i)<arr.get(i+1) && arr.get(i)<arr.get(i-1))
            {
                cnt++;
            }
        }
        return cnt;
    }
}