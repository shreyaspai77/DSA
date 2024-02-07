public class arrayShiftRight {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] shiftRight(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return nums;
        }

        int[] result = new int[k];
        for (int i = nums.length - k, j = 0; i < nums.length && j < result.length; i++, j++) {
            result[j] = nums[i];
        }
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
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

    // private static int[] shiftRight(int[] arr) {
    // int temp = arr[arr.length - 1];
    // for (int i = arr.length - 1 - 1; i >= 0; i--) {
    // arr[i + 1] = arr[i];
    // }
    // arr[0] = temp;

    // return arr;
    // }

}
