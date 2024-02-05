import java.util.Random;
import java.util.Scanner;

public class stackImplementation {

    public static void main(String[] args) {
        Random random= new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the stack");
        int size = scanner.nextInt();
        stack st = new stack(size);
        for (int i = 0; i < size; i++) {
            st.push(random.nextInt(100));
            st.display();
        }
        for (int i = 0; i < size; i++) {
            st.pop();
            st.display();
        }
        st.pop();


    }
}
