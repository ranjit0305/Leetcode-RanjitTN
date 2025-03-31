class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < asteroids.length){  
            int val = asteroids[i];
            if (stack.isEmpty() || stack.peek() < 0 || val > 0){
                stack.push(val);
                i++;
            }
            else {
                if (stack.peek() > 0 && val < 0){
                    int a = stack.peek();
                    int b = Math.abs(val);
                    if (a > b){
                        i++;
                    } else if (a == b) {
                        i++;
                        stack.pop();
                    } else {
                        stack.pop();
                    }
                }
            }

        }
        int[] result = new int[stack.size()];
        for (int j = 0; j < stack.size(); j++) {
            result[j] = stack.get(j);
        }

        return result;
    }
}