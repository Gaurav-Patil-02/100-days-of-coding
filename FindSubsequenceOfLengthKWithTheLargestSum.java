import java.util.Arrays;
import java.util.Comparator;

public class FindSubsequenceOfLengthKWithTheLargestSum {
    public static int[] maxSubsequence(int[] nums, int k) {
      int n = nums.length;
        int[][] indexed = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexed[i][0] = nums[i];
            indexed[i][1] = i;
        }

        Arrays.sort(indexed, (a, b) -> Integer.compare(b[0], a[0]));

        int[][] topK = Arrays.copyOfRange(indexed, 0, k);

        Arrays.sort(topK, Comparator.comparingInt(a -> a[1]));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i][0];
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {-2,-1,3,4};
        int k = 3;
        System.out.println(Arrays.toString(maxSubsequence(nums, k)));
    }
}


