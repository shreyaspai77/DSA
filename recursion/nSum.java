public class nSum {
    int sum = 0;

    // static void Summation(int i, int sum) {
    // if (i < 1) {
    // System.out.println(sum);
    // return;
    // }
    // Summation(i - 1, sum + i);
    // }
    public static int sum(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(100));

    }
}