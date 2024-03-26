import java.util.Scanner;

public class maxProfit {
    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        int profit = maxProfit(x);
        System.out.println(profit);
    }

    private static int maxProfit(int[] nums) {
        int profit = 0;
        int min = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            } else {
                profit = Math.max(nums[i] - min, profit);
            }
        }
        return profit;
    }
}
