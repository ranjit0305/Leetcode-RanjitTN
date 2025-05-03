class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) 
    {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < tops.length; i++) {
            count.put(tops[i], count.getOrDefault(tops[i], 0) + 1);
            if (tops[i] != bottoms[i]) {
                count.put(bottoms[i], count.getOrDefault(bottoms[i], 0) + 1);
            }
        }
        int candidate = Integer.MIN_VALUE;
        for (int key : count.keySet()) {
            if (count.get(key) >= tops.length)
            {
                candidate = key;
                break;
            }
        }
        if (candidate<0)
        {
            return -1;
        }
        int rotx=0;
        int roty=0;
        for(int i=0;i<tops.length;i++)
        {
            if(tops[i]!=candidate && bottoms[i]!=candidate)
            {
                return -1;
            }
            if(tops[i]!=candidate)
            {
                rotx++;
            }
            if(bottoms[i]!=candidate)
            {
                roty++;
            }
        }
        return Math.min(rotx,roty);
    }
}