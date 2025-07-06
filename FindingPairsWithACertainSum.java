import java.util.*;
public class FindingPairsWithACertainSum {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    Map<Integer, Integer> map = new HashMap<>();

    public void FindSumPairs(int[] nums1, int[] nums2) {
        for (int num : nums1) list1.add(num);
        for (int num : nums2) {
            list2.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = list2.get(index);
        map.put(oldVal, map.get(oldVal) - 1);

        int newVal = oldVal + val;
        list2.set(index, newVal);

        map.put(newVal, map.getOrDefault(newVal, 0) + 1);
    }
    
    public int count(int tot) {
        int c = 0;
        for(int x : list1){
            int complement = tot - x;
            c += map.getOrDefault(complement, 0);   
        }
        return c;
    }

}
