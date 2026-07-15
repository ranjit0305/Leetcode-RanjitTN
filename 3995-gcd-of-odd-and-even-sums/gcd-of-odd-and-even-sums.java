class Solution {
    public int gcdOfOddEvenSums(int n) 
    {
        int cnt=0;
        int evensum=0;
        int oddsum=0;
        int start=1;
        while(cnt<n)
        {
            oddsum=oddsum+start;
            start=start+1;
            evensum=evensum+start;
            start=start+1;
            cnt++;
        }
        return gcd(evensum,oddsum);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}