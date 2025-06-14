import java.util.Arrays;

public class MaximizeProductDifference {
     public static  int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxProduct = nums[n - 1] * nums[n - 2];
        int minProduct = nums[0] * nums[1];
        return maxProduct - minProduct;
    }
    public static void main(String[] args) {
        int nums[] = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
}
