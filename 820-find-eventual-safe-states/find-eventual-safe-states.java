class Solution {
    private boolean dfs(int u,int[][] graph,int[] visited)
    {
        visited[u]=1;
        for(int v:graph[u])
        {
            if(visited[v]==0)
            {
               if(dfs(v,graph,visited))
               {
                return true;
               }
            }
            if(visited[v]==1)
            {
                return true;
            }
        }
        visited[u]=2;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int nodes=graph.length;
        List<Integer> safe=new ArrayList<>();
       
       int[] visited=new int[nodes];
       for(int i=0;i<nodes;i++)
       {
        if(visited[i]==0)
        {
            dfs(i,graph,visited);
        }
       }

       for(int i=0;i<nodes;i++)
       {
        if(visited[i]==2)
        {
            safe.add(i);
        }
       }
       return safe;
    }
}