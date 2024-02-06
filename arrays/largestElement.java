public class largestElement {
    public static void largestEle(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        largestEle(arr);
    }
}