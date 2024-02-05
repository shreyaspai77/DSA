import java.util.Arrays;

public class reverseString {
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

    public static void stringReverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        swap(arr, start, end);
        stringReverse(arr, start + 1, end - 1);
    }

    public static void stringReverse(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        swap(arr, i, n - i - 1);
        stringReverse(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int start = 0;
        int end = arr.length - 1;
        stringReverse(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
