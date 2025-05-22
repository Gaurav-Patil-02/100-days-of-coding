import java.util.*;
public class ZeroArrayTransformation_III {
     public static int maxRemoval(int[] nums, int[][] queries) {
        int queryIndex = 0;
        Queue<Integer> available = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> running = new PriorityQueue<>();

        Arrays.sort(queries, Comparator.comparingInt((int[] query) -> query[0]));

        for (int i = 0; i < nums.length; ++i) {
            while (queryIndex < queries.length && queries[queryIndex][0] <= i)
                available.offer(queries[queryIndex++][1]);
            while (!running.isEmpty() && running.peek() < i)
                running.poll();
            while (nums[i] > running.size()) {
                if (available.isEmpty() || available.peek() < i)
                    return -1;
                running.offer(available.poll());
            }
        }

        return available.size();
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,1};
        int queries[][] = {{1,3},{0,2},{1,3},{1,2}};
        System.out.println(maxRemoval(nums, queries));
    }
}
