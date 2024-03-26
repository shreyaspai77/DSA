import java.util.Scanner;

public class waterContainers {
    public static void main(String[] args) {
        int[] x = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            x[i] = sc.nextInt();
        }
        int maxArea = maxWaterOptimal(x);
        System.out.println(maxArea);
        sc.close();

    }

    private static int maxWaterOptimal(int[] nums) {
        int maxArea = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int height = Math.min(nums[left], nums[right]);
            int width = right - left;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            // if (nums[left] < nums[right]) {
            // left++;
            // } else {
            // right--;
            // }
            while (nums[left] <= height && left < right) {
                left++;
            }
            while (nums[right] <= height && left < right) {
                right--;
            }
        }
        return maxArea;
    }

    // brute
    private static int maxWaterContained(int[] x) {
        int maxArea = 0;
        // int area = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                int width = j - i; // this is 5
                int height = Math.min(x[i], x[j]); // this is 8 for some reason
                int area = width * height;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;

    }

}
