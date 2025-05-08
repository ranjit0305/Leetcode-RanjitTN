class Solution {
    public int countSegments(String s) {
        if (s.equals("")) {
            return 0;
        }
        String[] arr = s.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                count++;
            }
        }
        return count;
    }
}
