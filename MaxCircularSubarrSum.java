public class MaxCircularSubarrSum {
public static int maxSubarraySumCircular(int[] nums) {
  int totalSum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int currMax = 0, currMin = 0;
        boolean allNegative = true;

        for (int num : nums) {
            totalSum += num;

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            if (num > 0) allNegative = false;
        }

        if (allNegative) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxSubarraySumCircular(arr));
        
    }
}
