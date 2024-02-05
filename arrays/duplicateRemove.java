public class duplicateRemove {
    public static void duplicateRemover(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        i++;
        while (i < arr.length) {
            arr[i] = -1;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 4, 5 };
        duplicateRemover(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
