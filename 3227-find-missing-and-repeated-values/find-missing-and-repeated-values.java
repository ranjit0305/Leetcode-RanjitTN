class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int[] arr=new int[2];
        List<Integer> check=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(check.contains(grid[i][j]))
                {
                    arr[0]=grid[i][j];
                }
                else
                {
                check.add(grid[i][j]);
                }
            }
        }
        Collections.sort(check);
        int max=check.get(check.size()-1);
        for(int k=1;k<=max+1;k++)
        {
            if(!check.contains(k))
            {
                arr[1]=k;
                break;
            }
        }
        return arr;
    }
}