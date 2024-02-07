import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class unionArrays {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 7 };
        int[] arr2 = { 2, 3, 4, 6, 7 };
        union(arr1, arr2);

    }

    private static void union(int[] arr1, int[] arr2) {
        // List<Integer> array = new ArrayList<>();
        int asize = arr1.length;
        int bsize = arr2.length;
        Vector<Integer> arr = new Vector<>();
        // arr.getLast()
        int a = 0;
        int b = 0;
        while (a < asize && b < bsize) {
            if (arr1[a] <= arr2[b]) {
                if (arr.isEmpty() || arr.lastElement() != arr1[a]) {
                    arr.add(arr1[a]);
                }
                a++;
            } else {
                if (arr.isEmpty() || arr.lastElement() != arr2[b]) {
                    arr.add(arr2[b]);
                }
                b++;
            }
        }
        while (a < asize) {
            if (arr.isEmpty() || arr.lastElement() != arr1[a]) {
                arr.add(arr1[a]);
            }
            a++;
        }
        while (b < bsize) {
            if (arr.isEmpty() || arr.lastElement() != arr2[b]) {
                arr.add(arr2[b]);
            }
            b++;
        }
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
