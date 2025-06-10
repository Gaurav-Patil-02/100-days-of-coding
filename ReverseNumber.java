public class ReverseNumber {
    public static int reverseNumber(int num) {
        int rem = 0;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
public static void main(String[] args) {
    int num = 5255;
    System.out.println(reverseNumber(num));
}
}
