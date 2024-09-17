class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        
        // Assuming the maximum size of the result array would be the sum of both arrays
        String[] res = new String[arr1.length + arr2.length];
        
        int k = 0;
        
        // Compare each word in arr1 with arr2 and check for uniqueness in arr1 itself
        for (int i = 0; i < arr1.length; i++) {
            int cnt = 0;
            
            // Count occurrences of arr1[i] in arr1
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i].equals(arr1[j])) {
                    cnt++;
                }
            }
            
            // Only proceed if the word in arr1 is unique (appears once in arr1)
            if (cnt == 1) {
                cnt = 0;
                // Check if it exists in arr2
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].equals(arr2[j])) {
                        cnt++;
                    }
                }
                if (cnt == 0) { // Word is uncommon if it's not found in arr2
                    res[k] = arr1[i];
                    k++;
                }
            }
        }
        
        // Now check arr2 for words that are unique in arr2 and not in arr1
        for (int i = 0; i < arr2.length; i++) {
            int cnt = 0;
            
            // Count occurrences of arr2[i] in arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[i].equals(arr2[j])) {
                    cnt++;
                }
            }
            
            // Only proceed if the word in arr2 is unique (appears once in arr2)
            if (cnt == 1) {
                cnt = 0;
                // Check if it exists in arr1
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i].equals(arr1[j])) {
                        cnt++;
                    }
                }
                if (cnt == 0) { // Word is uncommon if it's not found in arr1
                    res[k] = arr2[i];
                    k++;
                }
            }
        }
        
        // Create a properly sized result array
        String[] finalRes = new String[k];
        for (int i = 0; i < k; i++) {
            finalRes[i] = res[i];
        }
        
        return finalRes;
    }
}

