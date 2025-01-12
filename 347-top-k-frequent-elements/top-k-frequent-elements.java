class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            int biggest=0; int key1=-10001;
                    for(int key: map.keySet()){
                        if(map.get(key)>biggest){
                            biggest = map.get(key);
                            key1= key;
                        }
                    }
                    map.remove(key1);
                    result[i] = key1;
        }
        return result;
        }
    }