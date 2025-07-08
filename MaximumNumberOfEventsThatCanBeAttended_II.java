import java.util.Arrays;

public class MaximumNumberOfEventsThatCanBeAttended_II {
 public static int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]);
        int n = events.length;

        int[][] dpTable = new int[n + 1][k + 1];

        for (int i = 1; i <= n; ++i) {
            int startTime = events[i - 1][0];
            int value = events[i - 1][2];

            int previous = binarySearch(events, startTime, i - 1);

            for (int j = 1; j <= k; ++j) {
                dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[previous][j - 1] + value);
            }
        }

        return dpTable[n][k];
    }

    private static int binarySearch(int[][] events, int endTime, int high) {
        int low = 0;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (events[mid][1] >= endTime) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
       int events[][] = {{1,2,4},{3,4,3},{2,3,10}}, k = 2;
       System.out.println(maxValue(events, k));
    }
}