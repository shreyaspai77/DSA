public class oneToN {
    public static void oneN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        oneN(i + 1, n);

    }

    public static void main(String[] args) {
        oneN(1, 20);
    }
}
