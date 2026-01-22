class Solution {
    public int minimumPairRemoval(int[] nums) 
    {
        int cnt = 0;
        List<Integer> arr = new ArrayList<>();
        for (int x : nums) {
            arr.add(x);
        }
        int i = 0;
        while (i < arr.size() - 1) 
        {
            if (arr.get(i) > arr.get(i + 1)) 
            {
                int minsum = Integer.MAX_VALUE;
                int min_index = 0;
                for (int k = 0; k < arr.size() - 1; k++) 
                {
                    int t_sum = arr.get(k) + arr.get(k + 1);
                    if (t_sum < minsum) 
                    {
                        minsum = t_sum;
                        min_index = k;
                    }
                }
                arr.set(min_index, minsum);
                arr.remove(min_index + 1);
                cnt++;
                i = 0;
            } 
            else 
            {
                i++;
            }
        }
        return cnt;
    }
}
