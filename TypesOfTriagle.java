public class TypesOfTriagle{
public static String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a)
            return "none";

        if (a == b && b == c)
            return "equilateral";
        else if (a == b || b == c || a == c)
            return "isosceles";
        else
            return "scalene";

    }    public static void main(String[] args) {
        int nums[] = {3,4,5};
        System.out.println(triangleType(nums));
    }
}