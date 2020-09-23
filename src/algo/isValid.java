package algo;

import java.util.*;

public class isValid {
    public static void main(String[] args) {
        String s = "(a[])[()]{}";
//        checkValid(s);

        System.out.println(isValidd(s));
    }

    public static boolean isValidd(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    private static boolean checkValid(String s) {
        int n = s.length();
        if (n % 2 == 1) return false;

        Map<Character, Character> pairs = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }

        }
        return stack.isEmpty();
    }
}
