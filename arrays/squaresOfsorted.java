import java.util.Arrays;
import java.util.Scanner;

public class squaresOfsorted {
    public static void main(String[] args) {
        int[] nums = new int[5];
        // int[] result = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        // SortSquareArray(nums);
        for (int i : SortSquareArrayProto(nums)) {
            System.out.println(i);
        }
        // System.out.println(absolute(-2));

    }

    // brute
    private static void SortSquareArray(int[] nums) {
        // int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        // return result;
    }

    private static int absolute(int nums) {
        if (nums < 0) {
            return (-nums);
        }
        return nums;
    }

    // space inefficient
    private static int[] SortSquareArrayProto(int[] nums) {
        int max = absolute(nums[0]);
        // find the max absolute value
        for (int i = 1; i < nums.length; i++) {
            if (absolute(nums[i]) > max) {
                max = absolute(nums[i]);
            }
        }
        int[] squareTrue = new int[(max * max) + 1];
        for (int i = 0; i < nums.length; i++) {
            squareTrue[nums[i] * nums[i]]++;
        }
        int[] result = new int[nums.length];
        int j = 0;
        int i = 0;
        while (j < squareTrue.length) {
            if (squareTrue[j] == 1) {
                result[i] = j;
                i++;
            }
            j++;
        }
        return result;
    }
}
