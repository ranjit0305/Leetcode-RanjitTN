class Solution {
    public int maxArea(int[] height) {
       int i=0;
       int size=height.length;
       int j=size-1;
       int maximum=Integer.MIN_VALUE;
       while(i<j){
        int h=Math.min(height[i],height[j]);
        int l=j-i;
        int product=h*l;
        maximum=Math.max(maximum,product);
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }

       }
       return maximum;   
    }
}