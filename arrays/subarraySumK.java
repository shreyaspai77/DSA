import java.util.Scanner;

public class subarraySumK {
    // all positive numbers

    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        int length = LongestLength(x, k);
        System.out.println(length);
    }

    private static int LongestLength(int[] x, int k) {

        int maxlength = 0;
        int left = 0;
        int right = 0;
        int sum = x[0];
        int n = x.length;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= x[left++];
            }
            if (sum == k) {
                maxlength = Math.max(maxlength, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += x[right];
            }
        }

        return maxlength;

    }
}
