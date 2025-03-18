import java.util.*;

class Solution {
    public int longestNiceSubarray(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int usedBits = 0, res = 0, l = 0;
        
        for (int r = 0; r < nums.length; r++) {
            // Remove elements from the left until there are no bit conflicts
            while (!arr.isEmpty() && (usedBits & nums[r]) != 0) {
                usedBits &= ~arr.get(0); // Remove first element from bitmask
                arr.remove(0); // Remove from list
                l++; // Move left pointer
            }

            arr.add(nums[r]);  // Add current element to list
            usedBits |= nums[r]; // Update bitmask
            res = Math.max(res, arr.size()); // Compare with previous max
        }

        return res;
    }
}
