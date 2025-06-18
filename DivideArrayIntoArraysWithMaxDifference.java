import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
     public static int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        if(n % 3 != 0) return new int[0][0];
        int index = 0;

        int result[][] = new int[n/3][3];
        for(int i = 0; i < nums.length; i += 3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            
            if(c - a > k){
                return new int[0][0];
            }

            result[index][0] = a;
            result[index][1] = b;
            result[index][2] = c;

            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,8,7,9,3,5,1}; int k = 2;
        System.out.println(Arrays.deepToString(divideArray(nums, k)));
    }
}