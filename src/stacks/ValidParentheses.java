package stacks;
import java.util.Stack;

public class ValidParentheses {
    /**
     * Problem: Determine if the input string has valid matching parentheses '()', '{}', '[]'.
     * Strategy: Use a Stack to track opening brackets.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}