import java.util.Vector;

public class intersection {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 7 };
        int[] arr2 = { 2, 3, 4, 6, 7 };
        intersectingArray(arr1, arr2);
    }

    private static void intersectingArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        Vector<Integer> arr = new Vector<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                arr.add(arr1[i]);
                i++;
                j++;
            } else {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
