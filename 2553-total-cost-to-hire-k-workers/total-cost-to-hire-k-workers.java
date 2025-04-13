class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n=costs.length;
        Queue<Integer>pq1=new PriorityQueue<>();
        Queue<Integer>pq2=new PriorityQueue<>();
        int i=0;
        while(i<candidates && i<n){
            pq1.add(costs[i]);
            i++;
        }
        int j=n-1;
        while(j>=i && n-j<=candidates){
            pq2.add(costs[j]);
            j--;
        }
        long ans=0;
        while(k>0){
           if(!pq1.isEmpty() && !pq2.isEmpty()){
               if(pq1.peek()<=pq2.peek()){
                   ans+=pq1.peek();
                   pq1.poll();
                   if(i<=j){
                       pq1.add(costs[i]);
                       i++;
                   }
               }else{
                   ans+=pq2.peek();
                   pq2.poll();
                   if(j>=i){
                       pq2.add(costs[j]);
                       j--;
                   }
               }
           }else if(!pq1.isEmpty() && pq2.isEmpty()){
               ans+=pq1.peek();
               pq1.poll();
               if(i<=j){
                   pq1.add(costs[i]);
                   i++;
               }
           }else if(pq1.isEmpty() && !pq2.isEmpty()){
               ans+=pq2.peek();
               pq2.poll();
               if(j>=i){
                   pq2.add(costs[j]);
                   j--;
               }
           }
            k--;
        }
        return ans;
    }
}