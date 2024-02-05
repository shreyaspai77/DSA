public class insertionSort {

    public static void recursiveInsertion(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }
        int hole = i;
        int key = arr[i];
        while (hole > 0 && arr[hole - 1] > key) {
            arr[hole] = arr[hole - 1];
            hole--;
        }
        arr[hole] = key;
        recursiveInsertion(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 1, 5 };
        recursiveInsertion(arr, 1, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
