package ep20validparentheses;

import java.util.Stack;

public class ValidParenthesesSolution {
    public static boolean isValid(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : string.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
