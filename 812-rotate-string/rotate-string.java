class Solution {
    public boolean rotateString(String s, String goal) {
        return (goal+goal).contains(s) && s.length()==goal.length() ;
    }
}