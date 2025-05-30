import java.util.Arrays;

public class DNFAlgo {
    public static void dnf(int nums[]) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }
    }
    public static void main(String[] args) {
        int nums [] = {0,2,0,1,1,0,0};
        dnf(nums);
        System.out.println(Arrays.toString(nums));
    }
}
