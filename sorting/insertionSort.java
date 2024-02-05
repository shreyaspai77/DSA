public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 2 };
        for (int i = 1; i < arr.length; i++) {// choose card for comparison
            int hole = i;//select the index
            int key = arr[hole];//select the value
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