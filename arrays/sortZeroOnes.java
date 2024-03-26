import java.util.Scanner;

public class sortZeroOnes {
    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        DutchNationalFlag(x);
        for (int i : x) {
            System.out.println(i);
        }

    }

    private static void DutchNationalFlag(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }
}
