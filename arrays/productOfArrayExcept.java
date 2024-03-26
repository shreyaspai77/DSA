import java.util.Scanner;

public class productOfArrayExcept {
    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        int[] pre = prefixProduct(x);
        // int[] suffix = suffixProduct(x);
        int[] result = new int[x.length];
        int suffixProduct = 1;
        for (int i = x.length - 1; i >= 0; i--) {
            result[i] = suffixProduct * pre[i];
            suffixProduct *= x[i];
        }
        // for (int i : result) {
        //     System.out.println(i);
        // }
        for (int i : nonZeroArrayProduct(x)) {
        System.out.println(i);
        }
    }

    private static int[] nonZeroArrayProduct(int[] x) {
        int product = 1;
        int[] result = new int[x.length];
        int count = 0;
        for (int i : x) {
            if (i == 0) {
                count++;
            }
        }
        if (count > 1) {
            return result;
        }
        for (int i : x) {
            if (i != 0) {
                product *= i;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (x[i] == 0) {
                result[i] = product;
            } else {
                result[i] = product / x[i];
            }
        }
        return result;

    }

    private static int[] suffixProduct(int[] nums) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'suffixProduct'");
        int[] suffixArray = new int[nums.length];
        suffixArray[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixArray[i] = suffixArray[i + 1] * nums[i + 1];
        }
        return suffixArray;
    }

    private static int[] prefixProduct(int[] nums) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'prefixProduct'");
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        return prefix;
    }

    // brute force
    private static int[] productExcept(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

}