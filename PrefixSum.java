public class PrefixSum {
    private int[] prefixSums;

    public PrefixSum(int[] nums) {
        prefixSums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSums[right + 1] - prefixSums[left];
    }
    public static void main(String[] args) {
        int nums[] = {-2, 0, 3, -5, 2, -1};
        PrefixSum pref = new PrefixSum(nums);
        pref.sumRange(1, 4);
    }
}
