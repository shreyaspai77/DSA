public class missingNumber {
    // static void missing(int[] arr) {
    // for (int i = 1; i < arr.length; i++) {
    // int flag = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[j] == i) {
    // flag = 1;
    // break;
    // }
    // }
    // if (flag == 0) {
    // System.out.println(i);
    // }
    // }
    // }
    // make a new array
    static void missing(int[] arr) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]] = 1;
        }
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == 0) {
                System.out.println(i);
            }
        }
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrSum += nums[i];
        }
        return (sum - arrSum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 0, 5 };
        System.out.println(missingNumber(arr));
        ;

    }
}
