import java.util.ArrayList;
import java.util.List;

public class moveZerostoEnd {
    public static int[] moveZeros(int n, int[] a) {
        int j = -1;
        // find the first zero
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        // no zeros
        if (j == -1) {
            return a;
        }
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                // swap if non zero
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                // point to the next zero
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1 };
        int n = 10;
        // List<Integer> arr1 = new ArrayList<>();/
        int[] ans = moveZeros(n, arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
