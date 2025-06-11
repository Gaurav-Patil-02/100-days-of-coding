public class ArmstrongNumber {
    public static boolean armstrong(int n) {
        int org = n;
        int num = 0, sum = 0;
        int count = String.valueOf(n).length() ;

        while (n > 0) {
            num = n % 10;
            sum += Math.pow(num, count);
            n /= 10;
        }
        return sum == org ? true : false;
       
    }

    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
}
