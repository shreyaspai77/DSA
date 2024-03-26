import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        InsertionSort(x);
        for (int i : x) {
            System.out.println(i);
        }
    }

    private static void InsertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int hole = i;
            int key = nums[i];
            while (hole > 0 && nums[hole - 1] > key) {
                nums[hole] = nums[hole - 1];
                hole--;
            }
            nums[hole] = key;
        }
    }
}
