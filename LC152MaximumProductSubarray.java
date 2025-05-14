public class LC152MaximumProductSubarray {

      public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = 0;
        int rightProduct = 1;
        int leftProduct = 1;

       if(n == 1){
        return nums[0];
       }
    
        for(int i = 0; i < n; i++){
            rightProduct = rightProduct == 0 ? 1 : rightProduct;
            leftProduct = leftProduct == 0 ? 1 : leftProduct;

            rightProduct *= nums[i];
            leftProduct *= nums[n-1 -i];

            maxProduct = Math.max(maxProduct, Math.max(rightProduct, leftProduct));
        } 

        return maxProduct;
    }

    public static void main(String[] args) {
        int nums[] = {-2,0,-1};
        System.out.println(maxProduct(nums));

    }
}