class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = n;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                cnt--;
            }
        }
        if (cnt <= 0) {
            return true;
        }
        return false;
    }
}
