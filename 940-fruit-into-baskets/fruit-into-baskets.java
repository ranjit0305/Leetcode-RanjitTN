class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;
        int sum = 0;

        for(int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            sum++;

            while(map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left])-1);
                sum--;

                if(map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}