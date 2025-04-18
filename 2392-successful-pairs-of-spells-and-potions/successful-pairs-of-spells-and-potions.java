class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int low = 0, high = potions.length - 1;
            int index = potions.length;

            while (low <= high) {
                int mid = (low + high) / 2;
                long prod = (long) spells[i] * potions[mid];

                if (prod >= success) {
                    index = mid;       // store current valid index
                    high = mid - 1;    // search left side
                } else {
                    low = mid + 1;     // search right side
                }
            }
            arr[i] = potions.length - index;
        }
        return arr;
    }
}
