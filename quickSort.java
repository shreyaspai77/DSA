import java.util.Scanner;

public class quickSort {

    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        quickSort(x, 0, x.length - 1);
        for (int i : x) {
            System.out.println(i);
        }

    }

    private static void quickSort(int[] x, int low, int high) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'quickSort'");
        if (low >= high) {
            return;
        }
        int pivot = Partition(x, low, high);
        quickSort(x, 0, pivot - 1);
        quickSort(x, pivot + 1, high);

    }

    private static int Partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        int j = low;
        while (j < high) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i + 1, high);
        return i + 1;

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
