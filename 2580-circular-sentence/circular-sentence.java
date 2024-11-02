class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" "); // Fixed array initialization
        for (int i = 0; i < arr.length - 1; i++) { // Loop through all but last word
            int l1 = arr[i].length();
            int l2 = arr[i + 1].length();
            
            // Compare the last character of the current word with the first character of the next
            if (arr[i].charAt(l1 - 1) != arr[i + 1].charAt(0)) {
                return false;
            }
        }
        
        // Special case: Compare last character of last word with first character of the first word
        int lastWordLength = arr[arr.length - 1].length();
        if (arr[arr.length - 1].charAt(lastWordLength - 1) != arr[0].charAt(0)) {
            return false;
        }
        
        return true;
    }
}
