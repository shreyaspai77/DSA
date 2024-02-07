import java.util.ArrayList;
import java.util.List;

public class arrayShiftLeft {
    public static int[] arrayShift(int[] nums, int k) {
        // store the results of the first k elements in an array
        k = k % nums.length;
        if (k == 0) {
            return nums;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i - k] = nums[i];
        }
        // int j = 0;
        for (int i = nums.length - k, j = 0; i < nums.length && j < result.length; i++, j++) {
            nums[i] = result[j];
        }
        return nums;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
