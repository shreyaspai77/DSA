import java.util.Scanner;

public class maxSubarraySum {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextInt();
        }

        int[] maxSum = maxSubarraySumFunc(nums);
        for (int i = maxSum[0]; i <= maxSum[1]; i++) {
            System.out.println(nums[i]);
        }
    }

    private static int[] maxSubarraySumFunc(int[] nums) {
        int sum = 0, maxSum = 0;
        // for (int i = 0; i < nums.length; i++) {
        // sum = Math.max(nums[i], nums[i] + sum);
        // maxSum = Math.max(maxSum, sum);
        // }
        maxSum = Integer.MIN_VALUE;
        int start = 0;
        int ansEnd = 0;
        int ansStart = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return new int[] { ansStart, ansEnd };

    }
}
