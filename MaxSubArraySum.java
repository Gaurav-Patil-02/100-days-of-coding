public class MaxSubArraySum {
    static int maxSubarraySum(int[] arr) {
        // Your code here
        int maxSum = arr[0], sumSoFar = 0;
        for(int i = 0; i < arr.length; i++){
            sumSoFar += arr[i];
            maxSum = Math.max(maxSum, sumSoFar);
            
            if(sumSoFar < 0){
                sumSoFar = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {10,25,36,45,36};
        System.out.println(maxSubarraySum(arr));
    }
}
