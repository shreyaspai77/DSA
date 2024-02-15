package String;

import java.util.HashMap;
import java.util.Stack;

public class validPalindrome {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        int n = s.length();
        HashMap<Character, Character> map = new HashMap<>();
        // for easier access/lazy to write all conditions;
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                charStack.push(c);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                if (map.get(c) == charStack.peek()) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (charStack.isEmpty()) {
            return true;
        }
        return false;
    }
}
