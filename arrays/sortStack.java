import java.util.Scanner;
import java.util.Stack;

public class sortStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> pst = new Stack<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            st.push(sc.nextInt());
        }
        pst = sortStack(st);
        for (Integer integer : pst) {
            System.out.println(integer);
        }
    }

    private static Stack<Integer> sortStack(Stack<Integer> st) {
        Stack<Integer> processedStack = new Stack<>();
        while (!st.empty()) {
            int currentElement = st.pop();
            while (!processedStack.empty() && processedStack.peek() > currentElement) {
                st.push(processedStack.pop());
            }
            processedStack.push(currentElement);
        }
        return processedStack;
    }
}
