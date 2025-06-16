import java.util.HashMap;
import java.util.Map;

public class FindTheHighestAndLowestFreq {
    public static int highestFreq(int nums[]) {
        int highFreq = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int value : map.values()) {
            if (value > highFreq) {
                highFreq = value;
            }
        }
        return highFreq;
    }

    public static int lowestFreq(int nums[]) {
        int lowFreq = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int value : map.values()) {
            if (value < lowFreq) {
                lowFreq = value;
            }
        }
        return lowFreq;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 6, 2, 1, 5, 5, 5, 6, 3, 8, 9, 6, 9, 8, 7, 7, 8, 9 };
        System.out.println(highestFreq(nums));
        System.out.println(lowestFreq(nums));
    }
}
