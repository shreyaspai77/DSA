import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class leadersinArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int[] x = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
        }

        arr = leadersinArray(x);
        System.out.println(arr.toString());
    }

    private static List<Integer> leadersinArray(int[] x) {
        List<Integer> arr = new ArrayList<>();
        arr.add(x[x.length - 1]);
        int max = x[x.length - 1];
        for (int i = x.length - 2; i >= 0; i--) {
            if (x[i] > max) {
                arr.add(x[i]);
                max = x[i];
            }
        }
        return arr;

    }
}