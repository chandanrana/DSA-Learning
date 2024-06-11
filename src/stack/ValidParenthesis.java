package stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s = ")";
        boolean result = isValid(s);
        System.out.println(result);

    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case '(', '{', '[' -> stack.push(ch);
                case ')' -> {
                    if (stack.peek() == '(') stack.pop();
                }
                case '}' -> {
                    if (stack.peek() == '{') stack.pop();
                }
                case ']' -> {
                    if (stack.peek() == '[') stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
