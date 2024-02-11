public class invertingArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0 };
        // output ={0,0,1,1}
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
