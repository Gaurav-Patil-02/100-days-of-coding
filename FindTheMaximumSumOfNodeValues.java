public class FindTheMaximumSumOfNodeValues {
     public static long maximumValueSum(int[] nums, int k, int[][] edges) {
         long maxSum = 0;
    int changedCount = 0;
    int minChangeDiff = Integer.MAX_VALUE;

    for (final int num : nums) {
      maxSum += Math.max(num, num ^ k);
      changedCount += ((num ^ k) > num) ? 1 : 0;
      minChangeDiff = Math.min(minChangeDiff, Math.abs(num - (num ^ k)));
    }

    if (changedCount % 2 == 0)
      return maxSum;
    return maxSum - minChangeDiff;
    }
    public static void main(String[] args) {
       int nums[] = {1,2,1}, k = 3, edges[][] = {{0,1},{0,2}};
       System.out.println(maximumValueSum(nums, k, edges));
    }
}