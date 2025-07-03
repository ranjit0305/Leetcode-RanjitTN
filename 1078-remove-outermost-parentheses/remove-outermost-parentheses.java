class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int counter=0;
        for(int i=0;i<n;i++){
            if(counter==0){
                counter++;
            }
            else{
                if(s.charAt(i)=='('){
                    counter++;
                    sb.append('(');
                }
                else{
                    counter--;
                    if(counter!=0){
                    sb.append(')');
                    }
                }
            }
        }
        return sb.toString();
    }
}