class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      int c = 1,f=1;
      Arrays.sort(arr);
      Set<Integer> set = new HashSet<>();
      for(int i = 0;i<arr.length-1;i++){
          if(arr[i]!=arr[i+1]){
              set.add(c);
              f++;
              c=1;
          }
          else{
              c++;
          }
      }
      set.add(c);
      return set.size()==f?true:false;
    }
}