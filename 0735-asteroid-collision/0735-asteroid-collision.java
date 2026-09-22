class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int num : asteroids)
        {
            while (!stack.isEmpty() && num < 0 && stack.peek() > 0 && stack.peek() < -num) {
                stack.pop();
            }

            if(!stack.isEmpty() && num < 0 && stack.peek()==-num)
            {
               
                    stack.pop();
                
            }

            else if (stack.isEmpty() || num > 0 || stack.peek() < 0) {
                stack.push(num);
            }

        }

        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;


        
    }
}