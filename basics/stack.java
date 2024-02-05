public class stack {
    int top;
    int[] arr;

    stack(int size) {
        top = -1;
        arr = new int[size];
    }

    void statusOperation(boolean Success) {
        if (Success) {
            System.out.println("succesfull");
        } else {
            System.out.println("failed");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("stack empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    void push(int n) {
        if (top == arr.length) {
            statusOperation(false);
        } else {
            top++;
            arr[top] = n;
            statusOperation(true);
        }
    }

    void pop() {
        if (top == -1) {
            statusOperation(false);
            System.exit(0);
        } else {
            statusOperation(true);
            top--;
        }

    }

}