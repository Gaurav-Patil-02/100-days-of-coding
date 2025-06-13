import java.util.Arrays;

public class MinimizeTheMaximumDifferenceOfPairs {
    public static int n;
    public static boolean isValid(int[] nums, int mid, int p){
        int i = 0;
        int countPairs = 0;

        while( i < (n-1)){
            if(nums[i+1] - nums[i] <= mid){
                countPairs++;
                i += 2;
            }else{
                 i++;
            }
        }
        return countPairs >= p;
    }
    public static int minimizeMax(int[] nums, int p) {
        n = nums.length;
        Arrays.sort(nums);

        int left = 0;
        int right = nums[n-1] - nums[0];

        int result = Integer.MAX_VALUE;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(isValid(nums, mid, p)){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {4,2,1,2};
        int p = 1;
        System.out.println(minimizeMax(nums, p));
        
    }
}
