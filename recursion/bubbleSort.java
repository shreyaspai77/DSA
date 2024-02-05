public class bubbleSort {
    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void recursiveBubble(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        recursiveBubble(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 4, 1 };
        recursiveBubble(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
