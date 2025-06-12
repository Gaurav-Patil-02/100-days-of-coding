public class PalindromeUsingRecursion {

    public static boolean palidnrome(int i, String s){
        if(i > s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        return palidnrome(i+1, s);
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palidnrome(0, s));
    }
}
