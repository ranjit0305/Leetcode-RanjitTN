class Solution {
    public String getPermutation(int n, int k) {
        List<String> arr=new ArrayList<>();
        boolean[] used=new boolean[n+1];
        StringBuilder sb=new StringBuilder();
        makePermutation(n,k,sb,used,arr);
        return arr.get(k-1);
    }
    public void makePermutation(int n,int k,StringBuilder sb,boolean[] used,List<String> arr)
    {
        if(arr.size()==k)
        {
            return;
        }
        if(sb.length()==n)
        {
            arr.add(sb.toString());
            return;
        }
        for(int i=1;i<=n;i++)
        {
            if(used[i]==true)
            {
                continue;
            }
            sb.append(i);
            used[i]=true;
            makePermutation(n,k,sb,used,arr);
            used[i]=false;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}