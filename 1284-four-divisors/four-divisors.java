class Solution {
    public int sumFourDivisors(int[] nums) 
    {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            int ans=FindSum(nums[i]);
            res=res+ans;
        }    
        return res;
    }
    public int FindSum(int num)
    {
        int sum=0;
        List<Integer> temp=new ArrayList<>();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                temp.add(i);
                if(temp.size()>4)
                {
                    return 0;
                }
            }
        }
        if(temp.size()==4)
        {
            for(int i=0;i<temp.size();i++)
            {
            sum=sum+temp.get(i);
            }
        }
        return sum;
    }
}