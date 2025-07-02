import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits were 9
        //add the 1 to first index, other will filled with 0 automatically
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int nums1[] = {9};
        int nums2[] = {1, 2, 3};
        int nums3[] = {9, 9};
        int nums4[] = {4, 3, 2, 1};

        System.out.println(Arrays.toString(plusOne(nums1))); // [1, 0]
        System.out.println(Arrays.toString(plusOne(nums2))); // [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(nums3))); // [1, 0, 0]
        System.out.println(Arrays.toString(plusOne(nums4))); // [4, 3, 2, 2]
    }
}
