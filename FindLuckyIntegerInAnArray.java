import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInAnArray {
    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int maxLuck = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                maxLuck = Math.max(maxLuck, entry.getKey());
            }
        }
        return maxLuck > 0 ? maxLuck : -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4};
        System.out.println(findLucky(arr));

    }
}
