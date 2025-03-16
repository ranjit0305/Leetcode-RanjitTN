class Solution {
    // Helper function to check if all cars can be repaired in 'time'
    private boolean f(int[] arr, int cars, long time) {
        long cnt = 0;

        // Loop through each mechanic
        for (int i = 0; i < arr.length; i++) {
            // Calculate how many cars this mechanic can repair in 'time'
            long x = (long) Math.sqrt(time / arr[i]);
            cnt += x;
            // Early stopping if we already have enough cars repaired
            if (cnt >= cars) return true;
        }
        return false;
    }

    public long repairCars(int[] ranks, int cars) {
        long s = 0; // Start of binary search
        long e = 1_000_000_000_000_000L; // End of binary search (1e15)

        long ans = e + 1; // Store the minimum time
        while (s <= e) {
            long mid = s + (e - s) / 2; // Avoid overflow

            // If 'mid' time is enough, try a smaller time
            if (f(ranks, cars, mid)) {
                ans = mid; // Update answer
                e = mid - 1; // Look for a smaller time
            } else {
                s = mid + 1; // Need more time
            }
        }
        return ans; // Final answer
    }
};