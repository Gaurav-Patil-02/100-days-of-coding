
import java.util.*;
public class MaximumDifferenceBeetweenEvenAndOddFrequency {
    public static int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (Integer values : map.values()) {
            if (values % 2 == 0) {
                minEven = Math.min(minEven, values);
            } else {
                maxOdd = Math.max(maxOdd, values);
            }
        }
        return maxOdd - minEven;
    }
public static void main(String[] args) {
    String s = "aaabcccddedadddbbbcdedca";
    System.out.println(maxDifference(s));
}
}
