import java.util.HashMap;
import java.util.Map;

public class appearsOnce {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4, 5, 5 };
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i : nums) {
            numFreq.put(i, numFreq.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        
    }
}
