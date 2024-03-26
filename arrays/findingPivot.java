import java.util.Scanner;

public class findingPivot {
    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        int pivot = pivotElement(x);
        System.out.println(x[pivot]);

    }

    private static int pivotElement(int[] nums) {
        // int pivot = -1;
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] <= nums[low]) {
                high = mid;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
        }

        return low;
    }
}
