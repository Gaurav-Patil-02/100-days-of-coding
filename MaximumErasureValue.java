import java.util.*;
public class MaximumErasureValue {
     public static int maximumUniqueSubarray(int[] nums) {
    int ans = 0;
    int score = 0;
    Set<Integer> seen = new HashSet<>();

    for (int l = 0, r = 0; r < nums.length; ++r) {
      while (!seen.add(nums[r])) {
        score -= nums[l];
        seen.remove(nums[l++]);
      }
      score += nums[r];
      ans = Math.max(ans, score);
    }

    return ans;
  }

  public static void main(String[] args) {
   int nums[] = {5,2,1,2,5,2,1,2,5};
   System.out.println(maximumUniqueSubarray(nums));
  }
}
