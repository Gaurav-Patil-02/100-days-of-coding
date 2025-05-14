import java.util.HashMap;

public class ContinuousSubarraySum {

     public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap <Integer ,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int rem = sum % k;
            if(rem == 0 && i >= 1){
                return true;
            }

            if(map.containsKey(rem)){
                int idx = map.get(rem);
                if((i - idx) >= 2) return true;
            }else{
                map.put(rem, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {23,2,4,6,7};
        int k = 6;

        System.out.println(checkSubarraySum(nums,k));
    }
}