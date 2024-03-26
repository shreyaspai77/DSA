//2864. Maximum Odd Binary Number

import java.util.Scanner;

public class maximumBinary {
    public static void main(String[] args) {
        // make a left index to find the location of the first 0;
        // right index finds the location of the first 1 that is not in the end;
        //
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ones = 0;
        int zeroes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                zeroes++;
            }
        }
        String result = "";
        for (int i = 0; i < ones - 1; i++) {
            result += '1';
        }
        for (int i = 0; i < zeroes; i++) {
            result += '0';
        }
        System.out.println(result+"1");
        

    }

    private static void swap(String s, int startIndex, int endIndex) {

    }
}
