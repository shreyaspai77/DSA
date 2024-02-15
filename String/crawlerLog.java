package String;

// 1598. Crawler Log Folder
public class crawlerLog {

    public static int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (count > 0) {
                    count--;
                }
            } else if (!logs[i].equals("./")) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] nums = { "./", "/d1", "../" };
        int count = minOperations(nums);
        System.out.println(count);
    }
}
