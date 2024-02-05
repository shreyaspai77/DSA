public class palindrome {
    public static boolean palindrome(String test, int start, int end) {
        if (start > end) {
            return true;
        }
        if (test.charAt(start) != test.charAt(end)) {
            return false;
        }
        return palindrome(test, start + 1, end - 1);

    }

    public static void main(String[] args) {
        String palindString = "saippuakivikauppias";
        int start = 0;
        int end = palindString.length() - 1;
        System.out.println(palindrome(palindString, start, end));
    }
}
