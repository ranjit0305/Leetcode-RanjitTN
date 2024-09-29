import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();  // Fixed: Use Boolean instead of boolean
        for (int i = 0; i < candies.length; i++) {
            int a = candies[i] + extraCandies;  // Add extra candies
            boolean res = true;  // Assume true initially
            for (int j = 0; j < candies.length; j++) {  // Fixed: Changed 'i' to 'j'
                if (!checkMax(a, candies[j])) {
                    res = false;  // If any kid has more candies than 'a', set to false
                    break;  // No need to check further
                }
            }
            arr.add(res);  // Fixed: Use 'arr' to add the result
        }
        return arr;  // Return the final list
    }

    public boolean checkMax(int ele1, int ele2) {
        return ele1 >= ele2;  // Compare the two elements
    }
}
