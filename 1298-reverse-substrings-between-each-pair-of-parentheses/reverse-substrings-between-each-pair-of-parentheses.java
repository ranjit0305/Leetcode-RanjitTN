class Solution {

    public String reverseParentheses(String s) {

        Stack<StringBuilder> stack = new Stack<>();

        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {

                stack.push(temp);
                temp = new StringBuilder();

            }
            else if(s.charAt(i) == ')') {

                temp.reverse();

                StringBuilder previous = stack.pop();

                previous.append(temp);

                temp = previous;
            }
            else {

                temp.append(s.charAt(i));
            }
        }

        return temp.toString();
    }
}