public class PalindromeNumber {

    public static boolean palindrome(int num){
        int org = num;
        int rev = 0, rem = 0;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        if(org == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(110011));
    }
}
