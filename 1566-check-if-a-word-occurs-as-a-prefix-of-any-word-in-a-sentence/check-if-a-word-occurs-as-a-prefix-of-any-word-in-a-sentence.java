class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" "); // Split sentence into words
        int startPos = -1;

        for (int i = 0; i < arr.length; i++) {
            int k = 0; // Pointer for searchWord
            for (int j = 0; j < arr[i].length(); j++) {
                if (k < searchWord.length() && arr[i].charAt(j) == searchWord.charAt(k)) 
                {
                    k++;
                } else {
                    break; // If characters don't match, stop checking this word
                }

                if (k == searchWord.length()) {
                    return i + 1; // Return 1-indexed position
                }
            }
        }

        return startPos; // Return -1 if no word matches
    }
}
