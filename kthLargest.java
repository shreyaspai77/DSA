import java.util.Scanner;

public class kthLargest {
    public static void main(String[] args) {
        int[] x = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            x[i] = sc.nextInt();
        }

        int output = FindGreatest(x, 1);
        System.out.println(output);

    }

    private static int FindGreatest(int[] x, int i) {
        // TODO Auto-generated method stub
        int greatest = quickSelect(x, 0, x.length - 1, x.length - i);
        return greatest;

    }

    private static int quickSelect(int[] x, int l, int r, int endIndex) {
        int pivot = x[r];
        int index = l;
        for (int i = l; i < r; i++) {
            if (x[i] <= pivot) {
                swap(x, index, i);
                index++;
            }
        }
        swap(x, r, index);
        if (index > endIndex) {
            return quickSelect(x, l, index - 1, endIndex);
        } else if (index < endIndex) {
            return quickSelect(x, index + 1, r, endIndex);
        } else {
            return x[index];
        }

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}

// input
// 3,2,1,5,6,4 k=2
// output 5
// 3,2,1,4,6,5