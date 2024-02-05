public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 2 };
        for (int i = 1; i < arr.length; i++) {
            int hole = i;
            int key = arr[hole];
            while (hole > 0 && arr[hole - 1] > key) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = key;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}