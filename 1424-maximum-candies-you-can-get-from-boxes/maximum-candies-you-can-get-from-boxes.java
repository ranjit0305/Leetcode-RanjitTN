class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = status.length;
        boolean[] vis = new boolean[n];         // whether box has been visited (opened)
        boolean[] hasBox = new boolean[n];      // whether we have the box
        boolean changed;                        // whether any new box got opened
        int total = 0;

        // Initialize hasBox[] from initialBoxes
        for (int box : initialBoxes) {
            hasBox[box] = true;
        }

        do {
            changed = false;
            for (int i = 0; i < n; i++) {
                if (!vis[i] && hasBox[i] && status[i] == 1) {
                    // open the box
                    vis[i] = true;
                    total += candies[i];
                    changed = true;
                    // use keys inside this box
                    for (int key : keys[i]) {
                        status[key] = 1;
                    }
                    // collect contained boxes
                    for (int b : containedBoxes[i]) {
                        hasBox[b] = true;
                    }
                }
            }
        } while (changed);
        return total;
    }
}
