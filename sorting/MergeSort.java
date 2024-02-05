// import java.util.Arrays;

public class MergeSort {
    public static void partitionSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        partitionSort(arr, low, mid);
        partitionSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int insertingToArray = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[insertingToArray] = arr[left];
                left++;
            } else {
                temp[insertingToArray] = arr[right];
                right++;
            }
            insertingToArray++;
        }

        while (left <= mid) {
            temp[insertingToArray] = arr[left];
            left++;
            insertingToArray++;
        }

        while (right <= high) {
            temp[insertingToArray] = arr[right];
            right++;
            insertingToArray++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 2 };
        partitionSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
