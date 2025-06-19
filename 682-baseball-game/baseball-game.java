class Solution {
    public int calPoints(String[] op) {
        int sum=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
                int temp = st.get(st.size()-2);
                st.push(st.peek()+temp);
            }else if(op[i].equals("D")){
                st.push(st.peek()*2);
            }else if(op[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        for(int s:st) sum+=s;
        return sum;
    }
}