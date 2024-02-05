public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // swap
        }
        for (int i : arr) {
            System.out.print(i);
        }

    }
}
