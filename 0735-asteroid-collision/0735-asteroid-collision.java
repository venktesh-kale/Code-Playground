class Solution {
    
    public int[] asteroidCollision(int[] asteroids) {
      if (asteroids == null) {
            return new int[0];
        }
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int asteroid : asteroids) {
            boolean flag = true;
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {             
                if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    stack.pop();
                    continue;
                } else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop();
                }
                flag = false;
                break;
            }

            if (flag) {
                stack.push(asteroid);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}