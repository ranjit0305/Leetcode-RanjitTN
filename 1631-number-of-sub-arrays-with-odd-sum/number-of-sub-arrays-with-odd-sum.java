
class Solution {
    public int numOfSubarrays(int[] arr) 
    {
        int even = 1;
        int odd = 0;
        int sum = 0;
        int cnt = 0;
        int mod = 1000000007;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            if(sum % 2 == 1)
            {
                cnt = (cnt + even) % mod;
                odd++;
            }
            else
            {
                cnt = (cnt + odd) % mod;
                even++;
            }
        }
        return cnt;
    }
}
