import java.util.Map;
import java.util.HashMap;
public class LongestHarmoniousSubsequence {
    public static  int  findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums){
            if(map.containsKey(num+1)){
                result = Math.max(result ,map.get(num) + map.get(num+1));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
