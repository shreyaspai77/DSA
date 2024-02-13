package String;
import java.util.Stack;

//844. Backspace String Compare
public class stringBackSpace {
    public static String processString(String s) {
        Stack<Character> procString = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!procString.isEmpty()) {
                    procString.pop();
                }
            } else {
                procString.push(s.charAt(i));
            }
        }
        String res = "";
        for (Character c : procString) {
            res += c;
        }
        return res;
    }

    public boolean backspaceCompare(String s, String t) {
        String s1 = processString(s);
        String t1 = processString(t);
        return (s1.equals(t1));
    }
    
}
