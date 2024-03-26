import java.util.Scanner;

public class nextPermutation {
    public static void main(String[] args) {
        int[] x = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }
        nextPermutation(x);
        for (int i : x) {
            System.out.println(i);
        }

    }

    private static void nextPermutation(int[] nums) {
        int breakingPoint = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakingPoint = i;
                break;
            }
        }
        if (breakingPoint == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        for (int i = n - 1; i > breakingPoint; i--) {
            if (nums[i] > nums[breakingPoint]) {
                swap(nums, i, breakingPoint);
                break;
            }
        }
        reverse(nums, breakingPoint + 1, n - 1);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }

    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
