package stack;

import java.util.Stack;

public class ValidateString {
    public static void main(String[] args) {
        String s = "(()())";

       boolean isValid =  validate(s);
        System.out.println(isValid);
    }

    private static boolean validate(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(' -> stack.push(ch);
                case ')' -> stack.pop();
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return isValid;
    }
}
