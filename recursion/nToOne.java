public class nToOne {
    static void nOne(int i, int n) {
        if (i > n) {
            return;
        }
        nOne(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        nOne(1, 20);
    }
}
