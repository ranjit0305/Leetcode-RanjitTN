import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> prime = new ArrayList<>();
        int[] arr = new int[2];
        int mingap = Integer.MAX_VALUE;

        // Find all primes in the range
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }

        // If there are fewer than 2 primes, return [-1, -1]
        if (prime.size() < 2) {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }

        int closestLeft = -1, closestRight = -1;
        // Find the closest prime pair
        for (int i = 0; i < prime.size() - 1; i++) {
            int gap = prime.get(i + 1) - prime.get(i);
            if (gap < mingap) {
                mingap = gap;
                closestLeft = prime.get(i);
                closestRight = prime.get(i + 1);
            }
        }

        arr[0] = closestLeft;
        arr[1] = closestRight;
        return arr;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
