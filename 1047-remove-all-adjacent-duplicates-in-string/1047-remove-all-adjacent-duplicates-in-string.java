class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.push(c);
            }
            else if (stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}