public class secondLargest {
    public static void secondLargest(int[] arr) {
        int max = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4 };
        secondLargest(arr);
        secondSmallest(arr);
    }

    private static void secondSmallest(int[] arr) {
        int min = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondSmallest = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
