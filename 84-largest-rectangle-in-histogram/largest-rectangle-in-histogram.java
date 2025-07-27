class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        int n=heights.length;
        int[] next=nextsmallerelement(heights);
        int[] prev=prevsmallerelement(heights);
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int length=heights[i];
            if(next[i] == -1) {
                next[i] = n;
            }
            int breadth = next[i] - prev[i] - 1;
            int newarea = length*breadth;
            area = Math.max(area,newarea);
        }
        return area;
    }
    public int[] prevsmallerelement(int[] heights)
    {
        int n=heights.length;
        int[] ret=new int[n];
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        for(int i=0;i<n;i++)
        {
            int curr=heights[i];
            while(stk.peek()!=-1 && heights[stk.peek()]>=curr)
            {
                stk.pop();
            }
            ret[i]=stk.peek();
            stk.push(i);
        }
        return ret;
    }

    public int[] nextsmallerelement(int[] heights)
    {
        int n=heights.length;
        int[] ret=new int[n];
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        for(int i=n-1;i>=0;i--)
        {
            int curr=heights[i];
            while(stk.peek()!=-1 && heights[stk.peek()]>=curr)
            {
                stk.pop();
            }
            ret[i]=stk.peek();
            stk.push(i);
        }
        return ret;
    }
}