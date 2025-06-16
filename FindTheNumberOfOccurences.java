import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfOccurences {
    public static void numberOfOccurences(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,5,6,2,1,5,5,5,6,3,8,9,6,9,8,7,7,8,9};
       numberOfOccurences(nums);
    }
}
