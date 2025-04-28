import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != arr2[i]) {
                return arr2[i];
            }
        }
        return arr2[arr2.length - 1];
    }
}
