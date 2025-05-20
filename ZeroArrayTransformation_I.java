public class ZeroArrayTransformation_I {
public static boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];  

        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            diff[l] += 1;
            if (r + 1 < n + 1) {
                diff[r + 1] -= 1;
            }
        }
        int[] maxDecrements = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            maxDecrements[i] = sum;
        }

            for (int i = 0; i < n; i++) {
            if (nums[i] > maxDecrements[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
    int nums[] = {4,3,2,1};
    int queries[][] = {{1,3},{0,2}};

    System.out.println(isZeroArray(nums, queries));
}
}
