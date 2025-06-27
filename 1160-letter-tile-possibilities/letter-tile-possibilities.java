class Solution {
    public int numTilePossibilities(String tiles) 
    {
        Set<String> set=new HashSet<>();
        boolean[] vis=new boolean[tiles.length()];
        permute(tiles," ",set,vis);
        return set.size()-1;
    }
    public void permute(String tiles,String curr,Set<String> set,boolean[] visited)
    {
        set.add(curr);
        for(int i=0;i<tiles.length();i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                permute(tiles,curr+tiles.charAt(i),set,visited);
                visited[i]=false;
            }
        }
    }
}