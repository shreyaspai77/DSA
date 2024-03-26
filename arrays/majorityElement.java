//169. Majority Element

public class majorityElement {
    public static int majorityElement(int[] nums) {
        
        int count = 1;
        int contestant = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                contestant = nums[i];
            }
            if (nums[i] == contestant) {
                count++;
            } else {
                count--;
            }

        }
        return contestant;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 2, 3, 4 };
        int freq = majorityElement(nums);
        System.out.println(freq);
    }
}