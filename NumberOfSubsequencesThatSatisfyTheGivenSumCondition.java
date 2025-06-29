import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
     public static int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        int n = nums.length;
        Arrays.sort(nums);

        int pow[] = new int[n];
        pow[0] = 1;
        for(int i = 1; i < n; i++){
            pow[i] = (pow[i-1] * 2) % mod;
        }
        int left = 0, right = n-1;
        int result = 0;
        while(left <= right){
            if(nums[left] + nums[right] <= target){
                result = (result + pow[right - left]) % mod;
                left ++;
            }else right--;
        }
        return result;
    }
    public static void main(String[] args) {
       int nums[] = {3,5,6,7}, target = 9;
       System.out.println(numSubseq(nums, target));
    }
}
